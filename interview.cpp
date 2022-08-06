#include <bits/stdc++.h>

using namespace std;

int main() {
	int n;
	cin >> n;
	int arr[n];
	for(auto& i : arr) {
		cin >> i;
	}

	int q;
	cin >> q;
	for(int i = 0; i < q; ++i) {
		int l, r;
		cin >> l >> r;
		int mr = -1, smr = -2, index = 0, smrindex = 0;
		for(int j = l; j <= r; ++j) {
			if(mr < arr[j]) {
				mr = arr[j];
				index = j;
			}
		}

		for(int j = l; j < index; ++j) {
			if(smr < arr[j]) {
				smr = arr[j];
				smrindex = j;
			}
		}
	
		long long sum = 0;
		if(index > smrindex) {
			for(int j = index - 1; j > smrindex; --j) {
				sum += smr - arr[j];
			}
		}else {
			for(int j = smrindex + 1; j < index; ++j) {
				sum += smr - arr[j];
			}
		}
		cout << sum;
	}
	return 0;
}
