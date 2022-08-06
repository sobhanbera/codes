/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 31-08-2020 01:13:10 PM
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
typedef vector<int> vi;
typedef pair<int, int> pii;

const int AAX = 1e5;
const int MOD = 1e9+7;
template <typename T> using oset = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

#define FORUS(a, b, st) for (int i = (a); (st) < 0 ? i > (b) : i < (b); i += (st))
#define FOR(to) FORUS(0, to, 1)
#define FORF(a, b) FORUS(a, b, 1)
#define REV(to) FORUS(to, 0, -1)
#define REVF(a, b) FORUS(a, b, -1)
#define dbg(x) cerr << (#x) << " -> " << (x) << endl
#define len(arr) (sizeof(arr) / sizeof(arr[0]))
#define sz(v) (v).size()
#define all(v) (v).begin(), (v).end()

void debug() {
	cerr << endl;
}

template<class A> bool mmin(A& a, const A& b) {
	return b < a ? a = b, 1 : 0;
}

template<class A> bool mmax(A& a, const A& b) { 
	return a < b ? a = b, 1 : 0;
}

string to_string(bool b) {
	return b ? "true" : "false";
}

string to_string(const char* s) {
	return (string) s;
}

string to_string(const vector<bool>& vec) {
    string res;
    for(auto && i : vec)
		res += char('0'+i);
    return res;
}

template<class A> void opera(A& a, ll num) {
	a += num;
}

template<class A> void opera(vector<A>& a, ll num) {
	for(A& i : a)
		opera(i, num);
}

template<class A, size_t n> void opera(A(&arr)[n], ll num) {
	for(A& i : arr)
		opera(i, num);
}

template<class A> void read(A& a) {
	cin >> a;
}

template<class B, class... A> void read(B& b, A&... a) {
	read(b); read(a...);
}

template<class A> void read(vector<A>& a) {
    for(auto& i : a) read(i);
}

template<typename A, size_t n> void read(A(&arr)[n]) {
    for(A& i : arr) read(i);
}

template<class A, class... B> void debug(A a, B... b) { dbg(a); debug(b...); }

template<typename A> void print(A a) {
	cout << a;
}

template<typename A> void prints(A a) {
	print(a); print(' ');
}

template<typename A> void println(A a) {
	print(a); print('\n');
}

template<typename A, typename... B> void print(A a, B... b) {
	print(a); print(b...);
}

template<typename A, typename... B> void prints(A a, B... b) {
	prints(a); prints(b...);
}

template<typename A, typename... B> void println(A a, B... b) {
	println(a); println(b...);
}

void println() { cout << '\n'; }

template<typename I> void printi(I fro, I to) { //I -> ForwardIterator(iterator).
    for(auto it = fro; it != to; ++it)
		prints(*it);
}

template<class A> void print(vector<A>& a) {
    printi(all(a));
}

template<typename A, size_t n> void print(A(&arr)[n]) {
    printi(arr, arr + n);
}

void solution(int time) {
	int n;
	read(n);
	int sum = 0;
	while(n > 0) {
		sum += n/5;
		n /= 5;
	}
	println(sum);
}

int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);
	
    int t = 1;
	//read(t);
    for(int nr = 1; nr <= t; ++nr) {
		//print("Case #", nr, ": ");
		solution(nr);
	}
	
	return EXIT_SUCCESS;
}

