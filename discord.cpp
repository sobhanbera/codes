#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, ans = 0, m = -1;
    cin >> n;
    int arr[8];
    for(int i = 1; i < 8; ++i) {
        cin >> arr[i];
        n -= arr[i];

        if(m < arr[i]) {
            ans = i;
            m = arr[i];
        }
    }
    cout << ans;
    return 0;
}
