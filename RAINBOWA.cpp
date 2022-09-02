/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-05-21 23:09:59
|*| @github    : https://github.com/sobhanbera
\*/
#include <bits/stdc++.h>
using namespace std;

#define FOR(i, a, b) for(int i = a; i <= b; ++i)
#define REV(i, b, a) for(int i = b; i >= a; --i)
#define FORL(i, a, b) for(long long i = a; i <= b; ++i)
#define REVL(i, b, a) for(long long i = b; i >= a; --i)
#ifndef ONLINE_JUDGE
#include "sb/local.h"
#else
#define dbg(...) 1
#endif

void solution(int _time) {
    int n;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; ++i)
        cin >> arr[i];

    bool flag = true;
    for(int i = 0, j = n - 1; i < j; ++i, --j) {
        if(arr[i + 1] - arr[i] > 1 && arr[j] - arr[j- 1] > 1) {
            flag = false;
            break;
        }
        if(arr[i] != arr[j]) {
            flag = false;
            break;
        }
    }

    if(flag)
        cout << "YES";
    else
        cout << "NO";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int t = 1;
    cin >> t;
    for(int time = 1; time <= t; ++time) {
        /* print("Case #", time, ": "); */
        solution(time);
    }
    return 0;
}
