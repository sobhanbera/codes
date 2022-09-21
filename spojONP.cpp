/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-13 16:28:22
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

// most of the numbers when increased using power
// there resulting number's last digit is in a repeating pattern
// and at max this pattern takes 4 more operations
// so each array element of the below variable contains array whose elements are
// formed when the array index is powered with arr[i]th index
int powerPatterns[10][4] = {
    {0, 0, 0, 0}, {1, 1, 1, 1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6, 4, 6},
    {5, 5, 5, 5}, {6, 6, 6, 6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1, 9, 1}};

void solution(int _time) {
  long long a, b;
  cin >> a >> b;

  // getting the last digit of number a so that we can figure out the index of
  // powerPattern to check on
  long long lastDigitOfA = a % 10, patternDigitOfB = b % 4;

  // since zero will only occur when the b is divisible by 4 and in this case
  // the number should be at last, or in other words the number should be at 3rd
  // index. else we have to decrease the value by 1 since we are using 0 based
  // indexing in array
  if (patternDigitOfB == 0)
    patternDigitOfB = 3;
  else
    patternDigitOfB--;

  // dbg(lastDigitOfA, patternDigitOfB);

  dbg(pow(a, b));
  cout << powerPatterns[lastDigitOfA][patternDigitOfB];
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
