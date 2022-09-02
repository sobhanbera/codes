/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-02 17:31:31
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

void solution(int _time) {
  int n, h, m, firstAlarm = INT_MAX;
  cin >> n >> h >> m;
  vector < pair < int, int >> vp(n);

  FOR(i, 0, n - 1) {
    cin >> vp[i].first >> vp[i].second;
  }
  sort(vp.begin(), vp.end());
  FOR(i, 0, n - 1) {
    if (vp[i].first >= h && vp[i].first - h <= firstAlarm) {
      int hr = vp[i].first - 1 - h;
      int mi = (60 - m) + vp[i].second;
      if (mi >= 60) {
        hr += mi / 60;
        mi = mi % 60;
      }
      cout << hr << " " << mi;
      return;
    }
  }
  int hr = (24 - h) + vp[0].first - 1;
  int mi = (60 - m) + vp[0].second;
  if (mi >= 60) {
    hr += mi / 60;
    mi = mi % 60;
  }
  cout << hr << " " << mi;
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
