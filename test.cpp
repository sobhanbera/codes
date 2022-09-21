// #include <bits/stdc++.h>
// using namespace std;
//
// #define FOR(i, a, b) for (int i = a; i <= b; ++i)
//
// int powerPatterns[10][4] = {
//     {0, 0, 0, 0}, {1, 1, 1, 1}, {2, 4, 8, 6}, {3, 9, 7, 1}, {4, 6, 4, 6},
//     {5, 5, 5, 5}, {6, 6, 6, 6}, {7, 9, 3, 1}, {8, 4, 2, 6}, {9, 1, 9, 1}};
// int main() {
//   int t;
//   cin >> t;
//   FOR(i, 0, t - 1) {
//     long long a, b;
//     cin >> a >> b;
//
//     int lastDigitOfA = a % 10, patternDigitOfB = b % 4;
//     if (patternDigitOfB == 0)
//       patternDigitOfB = 3;
//     else
//       patternDigitOfB -= 1;
//
//     cout << powerPatterns[lastDigitOfA][patternDigitOfB] << "\n";
//   }
//   return 0;
// }

// lower_bound and upper_bound in vector

#include <algorithm> // for lower_bound, upper_bound and sort
#include <iostream>
#include <vector> // for vector

using namespace std;

int main() {
  int gfg[] = {5, 6, 7, 7, 6, 5, 5, 6};

  vector<int> v(gfg, gfg + 8); // 5 6 7 7 6 5 5 6

  sort(v.begin(), v.end()); // 5 5 5 6 6 6 7 7

  vector<int>::iterator lower, upper;
  lower = lower_bound(v.end(), v.begin(), 7);

  // cout << "lower_bound for 6 at position " << (lower - v.begin()) << '\n';
  // cout << "upper_bound for 6 at position " << (upper - v.begin()) << '\n';

  cout << lower - v.begin();

  return 0;
}
