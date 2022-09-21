/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-13 00:25:27
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
#define ll long long

const int maxFactorsOf1e14Is = 225;
const int questionLimit = 1e6;
bool isStealthy(ll n) {
  // since the number of factors for numbers like 1, 10, 100, 1000, 10000,
  // 100000, 1000000 are in a pattern (num_of_zeros + 1)^2
  // so the number of factors of 1e14 will not exceed 225
  // and I decided to use 1 based indexing so the size of the array must be
  // atleast 226
  int factors[maxFactorsOf1e14Is +
              1] = {0},
              currentIndex =
                  1; // here the currentIndex will act as number of factors
                     // indirectly, remember indexing starts from 1
  FOR(i, 1, n / 2) {
    if (n % i == 0) {
      factors[currentIndex++] = i;
    }
  }
  // since we are itterating to n/2 so we have to
  // also remember that n is also its one of the factor
  factors[currentIndex] = n;

  // cout << n << "-";
  // FOR(i, 1, maxFactorsOf1e14Is) {
  //   if (factors[i]) {
  //     cout << factors[i] << " ";
  //   }
  // }
  // return true;

  // above all the factors are been found, now we have to see that if the n is
  // prime or not, and to check this if the number is prime then the factors[2]
  // will be 0, since there will be no factors more than 3
  // and if, it is like that then return false and don't even continue
  if (factors[3] == 0)
    return false;

  // now let's itterate over the factors and find if there are any possible a,
  // b, c, d, told in the problem statement
  // itterating in such a way that always the following factor array's index are
  // being accessed (1, n-1), (2, n-2), (3, n-3), (4, n-4),... and so on..
  // and will compare all the above with (2, n-2), (3, n-3), (4, n-4)... and so
  // on with every above factor pairs
  FOR(i, 1, currentIndex / 2) {
    FOR(j, i + 1, currentIndex / 2) {
      ll a = factors[i], b = factors[currentIndex - i], c = factors[j],
         d = factors[currentIndex - j];

      dbg(n, a, b, c, d);
      // first condition which is easy always
      if (a + b == c + d + 1 || a + b + 1 == c + d) {
        ll ab = a * b, cd = c * d;

        // second condition
        if (ab == cd && ab == n) {
          cout << true;
          // just return true, and we don't need to check other factors...
          return true;
        }
      }
    }

    // if currentIndex is odd that means there are odd number of factors of n
    // in this case we have to access the middle element also
    if (currentIndex & 1) {
      ll a = factors[i], b = factors[currentIndex - i],
         c = factors[currentIndex / 2 + 1],
         d = factors[currentIndex - (currentIndex / 2) + 1];

      // TODO: also to find for c + d == a + b + 1

      dbg(n, a, b, c, d, "odd");
      // first condition which is easy always
      if (a + b == c + d + 1 || a + b + 1 == c + d) {
        ll ab = a * b, cd = c * d;

        // second condition
        if (ab == cd && ab == n) {
          cout << true;
          // just return true, and we don't need to check other factors...
          return true;
        }
      }
    }
  }

  // else return false, since no a, b, c and d could be found above
  return false;
}

void solution(int _time) {
  ll cnt = 0;
  FORL(i, 1, 36) {
    if (isStealthy(i)) {
      cnt++;
      // cout << i << " ";
    }
  }
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
