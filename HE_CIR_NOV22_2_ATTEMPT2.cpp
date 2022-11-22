#include<bits/stdc++.h>
using namespace std;

const int limit = 1000000;
int sieve[limit + 1] = {0}; // 0 - not visited, 1 - true, 2 - false
void runSieveOf4FactorsCreator() {
    int primes[limit + 1];
    fill_n(primes, limit + 1, 1);
    for(int i = 2; i * i < limit; ++i) {
        if(primes[i]) {
            for(int j = i + i; j < limit; j += i) {
                primes[j] = 0;
            }
        }
    }

    vector<int> finalPrimes;
    for(int i = 2; i <= limit; ++i)
        if(primes[i]) finalPrimes.push_back(i);

    for(int i = 0; i < finalPrimes.size(); ++i) {
        int ith = finalPrimes[i];
        long long cube = 1LL * ith * ith * ith;
        if(cube <= limit) {
            sieve[cube] = 1;
        }

        for(int j = i + 1; j < finalPrimes.size(); ++j) {
            int jth = finalPrimes[j];

            if(1LL * ith * jth > limit)
                break;

            sieve[ith * jth] = 1;
        }
    }
}

int main() {
    runSieveOf4FactorsCreator();

    int t;
    cin >> t;
    while(t--) {
        int l, r, cnt = 0;
        cin >> l >> r;

        for(int i = l; i <= r; ++i) {
            if(sieve[i]) {
                cnt++;
            }
        }

        cout << cnt << '\n';
    }
}
