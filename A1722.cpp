/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-08-30 20:47:41
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
#define strend string::npos

void solution(int _time) {
  int n;
  cin >> n;
  string s;
  cin >> s;
  if (n == 5 && (int)s.find('T') != string::npos &&
      (int)s.find('i') != string::npos && (int)s.find('m') != string::npos &&
      (int)s.find('u') != string::npos && (int)s.find('r') != string::npos) {
    cout << "YES" << endl;
  } else {
    cout << "NO" << endl;
  }
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
