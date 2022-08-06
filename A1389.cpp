/*
 *  @author : sobhanbera
*/
//#include <bits/stdc++.h>
#pragma GCC optimize("O3")
#include <iostream>
#include <fstream>
#include <sstream>
#include <iomanip>
#include <cassert>
#include <cmath>
#include <limits>
#include <string>
#include <limits>
#include <cstdlib>
#include <ctime>
#include <numeric>
#include <vector>
#include <list>
#include <map>
#include <set>
#include <bitset>
#include <stack>
#include <queue>
#include <deque>
#include <algorithm>
#include <iterator>
#include <functional>
#include <utility>
using namespace std;
#define ff first
#define ss second
#define pb push_back
#define eb emplace_back
#define lb lower_bound
#define ub upper_bound
#define search(L, N) binary_search(L.begin(), L.end(), N)
#define setbits(x) __builtin_popcountll(x)
#define zrobits(x) __builtin_ctzll(x)
#define ios ios_base::sync_with_stdio(0),cin.tie(0),cout.tie(0);

#define For(i, a, b, step) for(int i = a; step > 0 ? i < b : i > b; i += step)
#define FOR(e) For(i, 0, e, 1)
#define FOR1(a, b) For(i, a, b, 1)

typedef long long ll;
typedef long double ld;
typedef unsigned long long int uint32;
typedef unsigned long long uint64;
const int INFI = 1e9;
const long long INFL = 1e18;
const int MAX = 2e5+5;
const int MOD = 1e9+9;
const ll INF = 1e18;
const ld EFS = 1e-9;
const ld PI = acos((ld)-1);

string toString() { return ""; }
string toString(const string& s) { return '"' + s + '"'; }
string toString(bool b) { return b ? "true" : "false"; }
string toString(int i) { return to_string(i); }
string toString(double d) { return to_string(d); }
string toString(long long l) { return to_string(l); }
string toString(long double d) { return to_string(d); }
string toString(const char* s) { return toString((string) s); }
string toString(vector<bool> v) {bool first = true; string res = "{";for (int i = 0; i < static_cast<int>(v.size()); i++) {if (!first) {res += ", ";}first = false;res += to_string(v[i]);}res += "}";return res;}
template <size_t N>string toString(bitset<N> v) {string res = "";for (size_t i = 0; i < N; i++) {res += static_cast<char>('0' + v[i]);}return res;}
template <typename A, typename B>string toString(pair<A, B> p) {return "(" + to_string(p.first) + ", " + to_string(p.second) + ")";}
template <typename A, typename B, typename C>string toString(tuple<A, B, C> p) {return "(" + to_string(get<0>(p)) + ", " + to_string(get<1>(p)) + ", " + to_string(get<2>(p)) + ")";}
template <typename A, typename B, typename C, typename D>string toString(tuple<A, B, C, D> p) {return "(" + to_string(get<0>(p)) + ", " + to_string(get<1>(p)) + ", " + to_string(get<2>(p)) + ", " + to_string(get<3>(p)) + ")";}

template<class t, class u> void smax(t& a, u b) { if(a < b)a = b; }
template<class t, class u> void smin(t& a, u b) { if(a > b)a = b; }

template<class A> void write(A x) { cout << toString(x); }
template<class A, class... B> void write(const A& a, const B&... b) { write(a); write(b...); }
void print() { cout << "\n"; }
template<class H, class... T> void print(const H& h, const T&... t) { write(h); if(sizeof...(t)) write(' '); print(t...); }
template<class A> void read(A& x) { cin >> x; }
void read(double& d) { string t; read(t); d=stod(t); }
void read(long double& d) { string t; read(t); d=stold(t); }
template<class A, class... B> void read(A& a, B&... b) { read(a); read(b...); }

int gcd(int a, int b) { if(b == 0) return a; return gcd(b, a % b); }
uint32 lcm(int a, int b) { return a * b / gcd(a, b); }

int S = 0, A[MAX];
int take = 1;
void solve() {
	int l, r;
	read(l, r);
	if(r < l * 2) {
		cout << "-1 -1";
	} else {
		cout << l << " " << l * 2;
	}
	cout <<endl;
}

int main() {
	ios;
	
	int t = 1;
	if(take)
		cin >> t;
	while(t--) {
		solve();
	}
    return 0;
}

