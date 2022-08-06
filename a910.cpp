/*         ___  ___ | |__ | |__   __ _ _ __ | |__   ___ _ __ __ _ 
          / __|/ _ \| '_ \| '_ \ / _` | '_ \| '_ \ / _ \ '__/ _` |
@author:- \__ \ (_) | |_) | | | | (_| | | | | |_) |  __/ | | (_| |
          |___/\___/|_.__/|_| |_|\__,_|_| |_|_.__/ \___|_|  \__,_|
@since :-
19-10-2018
@created on :-
04-08-2020 23:16:47
*/
#pragma GCC optimize("O3")
//#include <bits/stdc++.h>
#include <iostream>
#include <fstream>
#include <sstream>
#include <cstdlib>
#include <cstring>
#include <cstdio>
#include <string>
#include <cmath>
#include <bitset>
#include <vector>
#include <queue>
#include <deque>
#include <stack>
#include <list>
#include <set>
#include <map>
#include <functional>
#include <iterator>
#include <numeric>
#include <time.h>
#include <utility>
#include <algorithm>
#include <cassert>
#include <climits>
using namespace std;

#define ff first
#define ss second
#define pb push_back
#define lb lower_bound
#define ub upper_bound
#define search(L, N) binary_search(L.begin(), L.end(), N)
#define setbits(x) __builtin_popcountll(x)
#define zrobits(x) __builtin_ctzll(x)
#define isVowel(c) (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
#define rapidio ios_base::sync_with_stdio(0),cin.tie(0);

#define For(i, a, b, step) for(long long i = a; step > 0 ? i < b : i > b; i += step)
#define FOR(e) For(i, 0, e, 1)
#define FOR1(a, b) For(i, a, b, 1)

typedef unsigned long long int uint32;
typedef unsigned long long uint64;

const int pax = 2e5+5;
const int mod = 1e9+9;
const long long inf = 1e18;

string toString() {
	return "";
}
string toString(const string& s) {
	return '"' + s + '"';
}
string toString(bool b) {
	return b ? "true" : "false";
}
string toString(int i) {
	return to_string(i);
}
string toString(double d) {
	return to_string(d);
}
string toString(long long l) {
	return to_string(l);
}
string toString(long double d) {
	return to_string(d);
}
string toString(const char* s) {
	return toString((string) s);
}
string toString(vector<bool> v) {
	bool f = true;
	string res = "{";
	for (int i = 0; i < static_cast<int>(v.size()); i++) {
		if (!f) res += ", ";
		f = false;
		res += to_string(v[i]);
	}
	res += "}";
	return res;
}
template <size_t N>
string toString(bitset<N> v) {
	string res = "";
	for (size_t i = 0; i < N; i++) res += static_cast<char>('0' + v[i]);
	return res;
}
template <typename A, typename B>
string toString(pair<A, B> p) {
	return "(" + to_string(p.first) + ", " + to_string(p.second) + ")";
}
template <typename A, typename B, typename C>
string toString(tuple<A, B, C> p) {
	return "(" + to_string(get<0>(p)) + ", " + to_string(get<1>(p)) + ", " + to_string(get<2>(p)) + ")";
}
template <typename A, typename B, typename C, typename D>
string toString(tuple<A, B, C, D> p) {
	return "(" + to_string(get<0>(p)) + ", " + to_string(get<1>(p)) + ", " + to_string(get<2>(p)) + ", " + to_string(get<3>(p)) + ")";
}

void println() {
	cout << "\n";
}
template<class A>
void print(A& a) {
	cout << a;
}
template<typename... A>
void print(A&&... val) {
	((cout << val), ...);
}
template<typename... A>
void prints(A&&... val) {
	((cout << val << " "), ...);
}
template<typename... A>
void println(A&&... val) {
	((cout << val << "\n"), ...);
}

void dbg() {
	cerr << ";" << endl;
}
template<class A, class... B>
void dbg(A a, B... b) {
	cerr << toString(a);
	if(sizeof...(b)) cerr << ", ";
	dbg(b...);
}

template<typename... A>
void gets(A&... val) {
	((cin >> val), ...);
}
template<class A>
void gets(A& x) {
	cin >> x;
}
void gets(double& d) {
	string t;
	gets(t);
	d = stod(t);
}
void gets(long double& d) {
	string t;
	gets(t);
	d = stold(t);
}
template<class A, class... B>
void gets(A& a, B&... b) {
	gets(a);
	gets(b...);
}

template<class t, class u>
void smax(t& a, u b) {
	if(a < b)a = b;
}
template<class t, class u>
void smin(t& a, u b) {
	if(a > b)a = b;
}
int gcd(int a, int b) {
	if(b == 0) return a;
	return gcd(b, a % b);
}
uint32 lcm(int a, int b) {
	return a * b / gcd(a, b);
}

int S = 0, A[pax];
void solve() {
	int n, m;
	string s;
	gets(n, m, s);
	int sum = 0;
	while(S < n-1) {
		int temp = -1;
		for(int j = S+1; j<=S+m; ++j) {
			if(s[j] == '1') {
				temp = j;
			}
		}
		if(temp == -1) {
			println(-1);
			return;
		}
		S = temp;
		++sum;
	}
	println(sum);
}

int main() {
	rapidio;
	int t = 1;
	//gets(t);
	while(t--)
		solve();
    return 0;
}
