#include<bits/stdc++.h>
using namespace std;

bool linearSearch(int arr[], int n, int x) {
	for(int i = 0; i < n; ++i) {
		if(arr[i] == x) return true;
	}
	return false;
}
int main() {
	int n;
	cout << "Enter the number of elements in array: ";
	cin >> n;
	int arr[n];
	cout << "Enter the elements: ";
	for(int& i : arr) cin >> i;
	int t;
	cout << "Enter the number of time you want to check the presence of any element: ";
	cin >> t;
	for(int i = 0; i < t; ++i) {
		cout << "Enter the search number: ";
		int x;
		cin >> x;
		if(linearSearch(arr, n, x)) cout << x << " is present in the array\n";
		else cout << x << " is not in the array\n";
	}
	return 0;
}
