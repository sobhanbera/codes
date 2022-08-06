// { Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h> 
using namespace std; 
int ValidPair(int* array, int n) ;

 // } Driver Code Ends


//User function Template for C++

// int binary(int arr[], int x, int l, int r) {
//     int mid = l + (r - l) / 2;
//     int sum = 0;
//     while(l <= r) {
//         if(arr[mid] >= x) {
//             ++sum;
//         }else {
            
//         }
//         mid = l + (r - l) / 2;
//     }
//     return sum;
// }

int ValidPair(int* arr, int n) {
    int sum = 0;
    for(int i = 0; i < n - 1; ++i) {
        for(int j = i + 1; j < n; ++j) {
            if(arr[i] + arr[j] > 0) {
                ++sum;
            }
        }
    }
    return sum;
} 

// { Driver Code Starts.
int main() 
{ 
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int array[n];
		for (int i = 0; i < n; ++i)
			cin>>array[i];
		cout<<ValidPair(array,n)<<endl;
	}
	return 0; 
} 

  // } Driver Code Ends
