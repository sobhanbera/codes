#include<bits/stdc++.h>
using namespace std;

const int limit = 1000000;
int prefix[limit + 1] = {0};
void runSieveOf4FactorsCreator() {
    int primes[limit + 1];

    fill_n(primes, limit + 1, 1);
    for(int i = 3; i * i < limit; ++i) {
        if(primes[i]) {
            for(int j = i + i; j < limit; j += i) {
                primes[j] = 0;
            }
        }
    }

    vector<int> finalPrimes;
    finalPrimes.push_back(2);
    for(int i = 2; i <= limit; ++i)
        if(primes[i] && i & 1) finalPrimes.push_back(i);

    int sieve[limit + 1] = {0};
    int shouldFindCubeAnyMore = 1;
    for(int i = 0; i < finalPrimes.size(); ++i) {
        int ith = finalPrimes[i];
        if(shouldFindCubeAnyMore) {
            long long cube = 1LL * ith * ith * ith;
            if(cube <= limit) {
                sieve[cube] = 1;
            } else {
                shouldFindCubeAnyMore = 0;
            }
        }

        for(int j = i + 1; j < finalPrimes.size(); ++j) {
            int jth = finalPrimes[j];

            long long mul = 1LL * ith * jth;
            if(mul > limit)
                break;

            sieve[mul] = 1;
        }
    }

    prefix[0] = 0;
    for(int i = 1; i <= limit; ++i) {
        prefix[i] = prefix[i - 1];
        if(sieve[i]) prefix[i]++;
    }
}

int main() {
    runSieveOf4FactorsCreator();

    int t;
    cin >> t;
    while(t--) {
        int l, r;
        cin >> l >> r;
        cout << prefix[r] - prefix[l - 1] << '\n';
    }
}
