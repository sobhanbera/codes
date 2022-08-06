#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cout << "Enter the number of elements of array: ";
	cin >> n;
	int arr[n];
	cout << "Enter the array elements: ";
	for(int& i : arr) cin >> i;
	// bubble sorting algorithm starts from here...
	for(int i = 0; i < n; ++i) for(int j = i + 1; j < n; ++j) if(arr[i] > arr[j]) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	cout << "The sorted array is: ";
	for(int i : arr) cout << i << " ";

    return EXIT_SUCCESS;
}

