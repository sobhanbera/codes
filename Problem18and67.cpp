/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-12 22:23:41
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

const int rows = 100;
// ans for 18th question - 1074
// ans for 67th question - 1074
void solution(int _time) {
  // current index choosed on every row currently at each itteration below
  int arr[rows][rows] = {{0}};

  // since the input is in form of triangle
  FOR(i, 0, rows - 1) {
    FOR(j, 0, i) { cin >> arr[i][j]; }
  }

  // moving from the last 2nd row to the 0th row
  REV(i, rows - 2, 0) {
    // here moving from the first col to the last col
    FOR(j, 0, i) {
      // and getting the maximum adjacent number to it
      arr[i][j] += max(arr[i + 1][j], arr[i + 1][j + 1]);
    }
  }
  // doing the above loop we will get ans at arr[0][0]
  cout << arr[0][0];
}

int main() {
  ios::sync_with_stdio(false);
  // input for problem 18
  // freopen("Problem18.txt", "r", stdin);
  // input for problem 67 - extended
  freopen("Problem67.txt", "r", stdin);
  cin.tie(nullptr);

  int t = 1;
  // cin >> t;
  for (int time = 1; time <= t; ++time) {
    solution(time);
    cout << '\n';
  }
  return 0;
}

// function solution(t) {
//   for (let i = t.length - 2; i >= 0; i--)
//     for (let j = 0; j <= i; j++)
//       t[i][j] += Math.max(t[i + 1][j], t[i + 1][j + 1]);
//   return triangle[0][0];
// }
