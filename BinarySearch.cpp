#include<bits/stdc++.h>
using namespace std;

bool binarySearch(int arr[], int n, int x) {
	int l = 0, r = n - 1, m;
	while(l <= r) {
		m = (l + r) / 2;
		if(arr[m] == x) return true;
		else if(arr[m] > x) r = m - 1;
		else l = m + 1;
	}
	return false;
}
int main() {
	int n;
	cout << "Enter the number of elements in array: ";
	cin >> n;
	int arr[n];
	cout << "Enter the elements of array in sorted order: ";
	for(int& i : arr) cin >> i;
	int t;
	cout << "Enter the number of time you want to check the presence of any element: ";
	cin >> t;
	for(int i = 0; i < t; ++i) {
		cout << "Enter the search number: ";
		int x;
		cin >> x;
		if(binarySearch(arr, n, x)) cout << x << " is present in the array\n";
		else cout << x << " is not in the array\n";
	}
	return 0;
}

