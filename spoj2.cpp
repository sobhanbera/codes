/*\
|*|  @author     : sobhanbera
|*|  @since      : 19-10-2018
|*|  @created on : 20-08-2020 06:24:35 PM
\*/
#include <bits/stdc++.h>
using namespace std;


int main() {
	vector<bool> primes(32000, true);

	//prime sieve
	primes[0] = primes[1] = 0;
	for(int i = 2; i < 32000; ++i) {
		if(primes[i]) {
			for(int j = i*i; j <= 32000; j += i) {
				primes[j] = false;
			}
		}
	}
	
	int t;
	cin >> t;

	while(t--) {
		int l, r;
		cin >> l >> r;
		for(int i = l; i <= r; ++i) {
			if(primes[i]) {
				printf("%d/n", i);
			}
		}
		printf("\n");
	}

    return EXIT_SUCCESS;
}

