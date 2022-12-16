#include <bits/stdc++.h>
using namespace std;

int arr[1000006] = {
    0}; // 0 - not visited, 1 - visited and true, 2 - visited and false
bool numberHas4Factors(int n) {
  if (arr[n] == 1)
    return true;
  else if (arr[n] == 2)
    return false;

  int cnt = 2;
  int half = n / 2;
  int limit = min(half, 9);

  if (n & 1) {
    for (int i = 3; i <= limit; i++) {
      if (n % i == 0) {
        if (n / i > 9)
          cnt += 2;
        else
          cnt++;
      }

      if (cnt > 4)
        return false;
    }
  } else {
    // cnt = 2; // since it is divisible by 2

    for (int i = 2; i <= limit; i++) {
      if (n % i == 0) {
        if (n / i > 9)
          cnt += 2;
        else
          cnt++;
      }

      if (cnt > 4)
        return false;
    }
  }
  return cnt == 4;
}

int main() {
  int t;
  cin >> t;
  for (int i = 0; i < t; ++i) {
    int l, r;
    cin >> l >> r;
    int cnt = 0;
    for (int j = l; j <= r; ++j)
      if (numberHas4Factors(j)) {
        cnt++;
        arr[j] = 1;
      } else {
        arr[j] = 2;
      }

    cout << cnt << '\n';
  }
  return 0;
}

/**
 * the algorithm work like below -
 * 1. each number is divisible by 1 and itself, so each number has at least 2
 *factors already
 * 2. so we will set variable count to 2 and start checking from 2 to 9
 *		if any of [2, 9] divide the number evenly, we will check with one more
 *condition that is
 *		- if the quotient is more than 9, then we will add 2 to the count
 *		- because indirectly we will have two factors, one is the quotient and
 *the other is the divisor
 *		- for example, if the number is 36, then 36 / 2 = 18, so we will have 2
 *and 18 as factors
 *		- 2 is the divisor and 18 is the quotient
 *		- if the quotient is less than 9, then we will add 1 to the count
 *		- since we are going through the loop from 2 to 9, so we will have at
 *most 4 factors
 * 3. finally return if the count is 4 or not
 *
 * catch - to avoid TLE, we will iterate till min(half, 9), and also the range
 *changes with n == odd or even if n = an odd number then we will iterate till
 *min(half, 9) with i = 3, 5, 7, 9 if n = an even number then we will iterate
 *till min(half, 9) with i = 3, 4, 5, 6, 7, 8, 9. and also count++ since it is
 *even and divisible by 2 already here itself

 * and also we will save this data in an array, so that we don't have to
 calculate all this again and again for multiple test-cases
 */
