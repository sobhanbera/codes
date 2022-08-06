#include<bits/stdc++.h>
using namespace std;

int main() {
    int n, min = INT_MAX, lmin =  INT_MAX;
    cin >> n;
    int a[n], b[n];
    for(int& i : a) cin >> i;
    for(int& i : b) cin >> i;

    sort(a, a + n);
    sort(b, b + n);

    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            int diff = abs(a[i] - b[j]);
            if(diff < lmin) {
                lmin = diff;
            } else {
                continue;
            }
        }
        if(lmin < min) min = lmin;
    }
    cout << min;
    return 0;
}

