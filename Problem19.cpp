/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-09-12 16:37:01
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

int yearCode[2] = {0, 6};
int monthCode[12] = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
int dateToDay(int date, int month, int year) {
  int res = 0;
  int last2DigitsOFYear = year >= 2000 ? year - 2000 : year - 1900;
  // getting the last two digited year
  // year = year >= 2000 ? year - 2000 : year - 1900;

  // now for the day and leap year calculation part
  // take the remainder here
  res += last2DigitsOFYear;
  // dbg(last2DigitsOFYear);
  res += (last2DigitsOFYear / 4);

  // for the day of the month
  res += date;

  // for month code
  res += monthCode[month - 1];

  // for year itself and for year code
  // finally only adding the last two digits of the year
  if (year >= 1900 && year <= 1999)
    res += yearCode[0];
  else
    res += yearCode[1];

  // now to handle leap year
  if (year % 4 == 0) {
    // will only work for jan and feb for any leap year
    if (month <= 2) {
      res--;
    }
  }
  // dbg(res);

  return res % 7;
}

// ans - 171
void solution(int _time) {
  //.starting date is 1 Jan 1901
  // ending date is 31st Dec 2000
  // to find is the number of sundays between this date for only the first date
  // of each month of every year of every year we are adding number of days in
  // each year... also taking care for any leap year and since the range is
  // 1901-2000 so we don't need to check for century leap year which is year %
  // 400 == 0
  float sundays = 0;
  // cout << "\n" << dateToDay(2, 3, 2004);
  // cout << "\n" << dateToDay(1, 4, 1983);
  FOR(i, 1901, 2000) {
    FOR(j, 1, 12) {
      if (dateToDay(1, j, i) == 0) {
        sundays++;
        // cout << 1 << "-" << j << "-" << i << "\n";
      }
    }
  }
  cout << "\nNumber Of Sundays: " << sundays;
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
