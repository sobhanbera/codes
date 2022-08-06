#include <bits/stdc++.h>
using namespace std;

int main() {
	int n, m, k;
	cin >> n >> m >> k;
	int arr[n];
	for(int i = 0; i < n; ++i) {
		cin >> arr[i];
	}
	int arrr[m]; 
	for(int i = 0; i < m; ++i) {
		cin >> arrr[i];
	}

	sort(arr, arr + n);
	sort(arrr, arrr + m);
	
	int sum = 0;
	int curin = 0;
	for(int i = 0; i < m; ++i) {
		for(int j = curin; j < n; ++j) {
			if(arr[j] >= 0) {
				if(abs(arrr[i] - arr[j]) <= k) {
					sum++;
					arr[j] = -1;
					curin = j+1;
					break;
				}
			}
		}
	}
	cout << sum;

    return EXIT_SUCCESS;
}

