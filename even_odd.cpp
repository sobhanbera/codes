#include<bits/stdc++.h>
using namespace std;

int main() {
    int n;
    long long s1 = 0, s2 = 0, p1 = 1, p2 = 1;
    cout << "Enter number of numbers you want to input: ";
    cin >> n;
    int arr[n]; for(int& i : arr) cin >> i;
    for(int i = 0; i < n; i++) {
        if(i & 2) {
            s1 += arr[i];
            p1 *= arr[i];
        }
        else{
            s2 += arr[i];
            p2 *= arr[i];
        }
    }

    cout << "Sum of numbers at odd position is: " << s1 << '\n';
    cout << "Sum of numbers at even position is: " << s2 << '\n';
    cout << "Product of numbers at odd position is: " << p1 << '\n';
    cout << "Product of numbers at even position is: " << p2 << '\n';
}
