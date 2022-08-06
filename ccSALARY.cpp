/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-05-17 20:40:43
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
	int n, minn = INT_MAX, cnt = 0;
	cin >> n;
	int arr[n];
	FOR(i, 0, n-1) {
		cin >> arr[i];
		minn = min(minn, arr[i]);
	}
	FOR(i, 0, n-1)
		cnt += arr[i] - minn;
	cout << cnt << '\n';
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
