/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-08-30 21:57:57
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
  int c;
  cin >> c;
  string a, b;
  cin >> a >> b;
  FOR(i, 0, c - 1) {
    if ((a[i] == 'R' && (b[i] == 'B' || b[i] == 'G')) ||
        (b[i] == 'R' && (a[i] == 'B' || a[i] == 'G'))) {
      cout << "NO\n";
      return;
    }
  }
  cout << "YES\n";
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
