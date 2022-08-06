#include <iostream>
using namespace std;

int lengt[9];
void longestIncreasingSubsequence(int arr[]) {
	for(int k = 0; k < 9; ++k) {
		lengt[k] = 1;
		for(int i = 0; i < k; ++i) {
			if(arr[i] < arr[k]) {
				lengt[k] = max(lengt[k], lengt[i]+1);
			}
		}
	}
}

int main() {
	int arr[] = {6,2,5,1,7,4,8,9};
	longestIncreasingSubsequence(arr);
	for(int i : lengt) {
		cout << i << ' ';
	}
	cout << '\n';
	return 0;
}
