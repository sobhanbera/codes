#include <bits/stdc++.h>
using namespace std;

int main() {
  int t;
  cin >> t;
  for (int i = 0; i < t; ++i) {
    int n;
    cin >> n;
    unsigned long long a[n], b[n];
    unsigned long long max = 0,
                       last_value; // last_value is init in below for loop
                                   // before using in comparison statement

    for (int j = 0; j < n; ++j)
      cin >> a[j];
    for (int j = 0; j < n; ++j)
      cin >> b[j];

    sort(a, a + n);
    sort(b, b + n);

    for (int j = 0; j < n; ++j) {
      unsigned long long andOp = a[j] & b[j];

      if (j) {
        unsigned long long curr_and = andOp & last_value;
        if (curr_and > max)
          max = andOp & last_value;
      }

      last_value = andOp;
    }

    cout << max << '\n';
  }
  return 0;
}
