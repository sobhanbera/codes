#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cout << "Enter the number of elements of array: ";
	cin >> n;
	int arr[n];
	cout << "Enter the array elements: ";
	for(int& i : arr) cin >> i;
	// insertion sorting algorithm starts from here...
	for(int i = 1; i < n; ++i) {
		int temp = arr[i], j = i - 1;
		while(j >= 0 && temp <= arr[j]) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1] = temp;
	}
	cout << "The sorted array is: ";
	for(int i : arr) cout << i << " ";
    return EXIT_SUCCESS;
}

