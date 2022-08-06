/*\
|*|  @author     : sobhanbera
|*|  @since      : 19-10-2018
|*|  @created on : 21-08-2020 06:57:46 PM
\*/
#pragma GCC optimize("O3")
#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>

using namespace std;
using namespace __gnu_pbds;

typedef long long ll;
typedef long double ld;
typedef unsigned long long ull;

#define FORUS(nr, a, b, step) for(int nr = a; step < 0 ? nr > b : nr < b; nr += step)
#define FOR(a) FORUS(nr, 0, a, 1)
#define FORR(a) FORUS(nr, a, -1, -1)

#define dbg(x) cerr << (#x) << " -> " << (x) << endl
#define len(arr) (sizeof(arr) / sizeof(arr[0]))
#define sz(v) (v).size()

template <typename T> using oset = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

const unsigned long long INF = 0xffffffffffffffff; //18446744073709551615
const int AAX = 0x3B9ACA09;                       //1e9+9;
const int MOD = 0x3B9ACA00;                      //1e9;

string to_string(bool b) { return b ? "true" : "false"; }
string to_string(const char* s) { return (string) s; }
string to_string(vector<bool> vec) {
	string res;
	for(unsigned int i = 0; i < sz(vec); ++i) res += char('0'+vec[i]);
	return res;
}
template <size_t N> string to_string(bitset<N> bi) {
	string res = "";
	for (size_t i = 0; i < N; i++) res += static_cast<char>('0' + bi[i]);
	return res;
}
template<class A> string to_string(A a) {
    bool fi=1;
    string res;
    for(auto& x : a) {
		if(!fi) res+=' ';
		fi=0;
		res+=to_string(x);
	}
    return res;
}

template<typename... A> void read(A&... a) {
	((cin >> a), ...);
}
template<class A> void read(vector<A>& a) {
	for(int i = 0; i < sz(a); ++i) cin >> a[i];
}
template<typename T, size_t n> void read(T(&arr)[n]) {
	for(size_t i = 0; i < n; ++i)
		read(arr[i]);
}

void debug() { cerr << endl; }

template<typename... A> void write(A... a) {
	((cout << a), ...);
}
template<typename... A> void writes(A... a) {
	((cout << a << " "), ...);
}

template<typename... A> void print(A... a) {
	((cout << a), ...);
	cout << endl;
}
template<typename... A> void prints(A... a) {
	((cout << a << " "), ...);
	cout << endl;
}

void println() { cout << "\n"; }
template<typename... A> void println(A... a) {
	((cout << a << endl), ...);
}
template<class A> void print(vector<A> a) {
	for(int i = 0; i < sz(a) - 1; ++i)
		writes(a[i]);
	write(a[sz(a) - 1]);
}
template<typename T, size_t n> void print(T const(& arr)[n]) {
	for(size_t i = 0; i < n - 1; ++i)
		writes(arr[i]);
	write(arr[len(arr) - 1]);
}

template<class A> void println(vector<A> a) {
	for(int i = 0; i < sz(a); ++i)
		println(a[i]);
}
template<typename T, size_t n> void println(T const(& arr)[n]) {
	for(size_t i = 0; i < n; ++i)
		println(arr[i]);
}

void test_cases() {
	int n;
	read(n);
	set<int> s;
	int x;
	FOR(n-1) {
		read(x);
		if(!s.count(x)) {
			writes(nr + 1);
		}
		s.insert(x);
	}
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t = 1;
	//cin >> t;
	for(int i = 1; i <= t; ++i) test_cases();
    return EXIT_SUCCESS;
}

