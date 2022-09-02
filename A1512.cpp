/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-01 18:24:31
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
  int n;
  cin >> n;
  int unique[105] = {0};
  int arr[n];
  FOR(i, 0, n - 1) {
    cin >> arr[i];
    unique[arr[i]]++;
  }
  FOR(i, 0, 100) {
    if (unique[i] == 1) {
      FOR(j, 0, n - 1) {
        if (arr[j] == i) {
          cout << j + 1;
          return;
        }
      }
    }
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
