/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-12 21:38:10
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

int sumOfDivisor(int n) {
  int sum = 0;
  FOR(i, 1, n / 2) {
    if (n % i == 0)
      sum += i;
  }
  return sum;
}

int visited[10005] = {0};

// ans -
void solution(int _time) {
  int cnt = 0;
  FOR(i, 1, 10000) {
    if (visited[i] == 0) {
      int sumOfDivisorOfI = sumOfDivisor(i);

      if (sumOfDivisorOfI != i && sumOfDivisor(sumOfDivisorOfI) == i) {
        cnt += i + sumOfDivisorOfI;

        visited[i]++;
        visited[sumOfDivisorOfI]++;

        // cout << i << " " << sumOfDivisorOfI << "\n";
      }
    }
  }
  cout << "Total Amicable numbers under 10000 are: ";
  cout << cnt;
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
