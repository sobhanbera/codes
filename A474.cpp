/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-02 01:39:04
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

string q = "qwertyuiopasdfghjkl;zxcvbnm,./";
void solution(int _time) {
  char dir;
  cin >> dir;
  string in;
  cin >> in;
  FOR(i, 0, (int)in.length() - 1) {
    if (dir == 'R') {
      cout << q[q.find(in[i]) - 1];
    } else {
      cout << q[q.find(in[i]) + 1];
    }
  }
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  int t = 1;
  // cin >> t;
  for (int time = 1; time <= t; ++time) {
    solution(time);
    cout << '\n';
  }
  return 0;
}
