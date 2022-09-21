/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-07 20:24:00
|*| @github    : https://github.com/sobhanbera
\*/
#include <bits/stdc++.h>
using namespace std;

#define FOR(i, a, b) for (int i = a; i <= b; ++i)
#define REV(i, b, a) for (int i = b; i >= a; --i)
#define FORL(i, a, b) for (long long i = a; i <= b; ++i)
#define REVL(i, b, a) for (long long i = b; i >= a; --i)
#ifndef ONLINE_JUDGE
#include "sb/local.h"
#else
#define dbg(...) 1
#endif

int minOpeartions(int n, int m, int a, int b, int d, int x = 1, int y = 1) {
  int cnt = 0;
  if (x < a) {
    x++;
    cnt++;
  }
  if (y < b) {
    y++;
    cnt++;
  }
  return min(minOperation)
}

void solution(int _time) {
  int n, m, a, b, d;
  cin >> n >> m >> a >> b >> d;
  cout << minOpeartions(n, m, a, b, d);
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  int t = 1;
  cin >> t;
  for (int time = 1; time <= t; ++time) {
    solution(time);
    cout << '\n';
  }
  return 0;
}
