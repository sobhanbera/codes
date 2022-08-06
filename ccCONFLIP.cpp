/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 27-08-2020 12:33:52 d
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
typedef pair<int, int> pi;

#define FORUS(nr, a, b, step) for(int nr = a; step < 0 ? nr > b : nr < b; nr += step)
#define FOR(a) FORUS(nr, 0, a, 1)
#define FORR(a) FORUS(nr, a, -1, -1)
#define dbg(x) cerr << (#x) << " -> " << (x) << endl
#define len(arr) (sizeof(arr) / sizeof(arr[0]))
#define sz(v) (v).size()
#define all(v) (v).begin(), (v).end()

template <typename T> using oset = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;
const int AAX = 1e5;
const int MOD = 1e9+7;

void debug() { cerr << endl; }
string to_string(bool b) { return b ? "true" : "false"; }
string to_string(const char* s) { return (string) s; }
string to_string(const vector<bool>& vec) {
    string res;
    for(auto && i : vec) res += char('0'+i);
    return res;
}
template<class A> void read(A& a) { cin >> a; }
template<class B, class... A> void read(B& b, A&... a) { read(b); read(a...); }
template<class A> void read(vector<A>& a) {
    for(auto& i : a) read(i);
}
template<typename A, size_t n> void read(A(&arr)[n]) {
    for(A& i : arr) read(i);
}
template<class A, class... B> void debug(A a, B... b) { dbg(a); debug(b...); }
void println() { cout << '\n'; }
template<class A> void print(vector<A>& a) {
    for(auto& i : a) cout << i << ' ';
}
template<typename A, size_t n> void print(A(&arr)[n]) {
    for(A& i : arr) cout << i << ' ';
}
template<typename I> void print(I fro, I to) { //I -> ForwardIterator(iterator).
    for(auto it = fro; it != to; ++it) cout << *it << ' ';
}

int head(int n, int q) {
	int t, h;
	if(n & 1) {
		t = (n >> 1)  + 1;
		h = t - 1;
	}else {
		t = h = n >> 1;
	}
	return q == 1 ? h : t;
}

int tail(int n, int q) {
	int t, h;
	if(n & 1) {
		h = (n >> 1)  + 1;
		t = h - 1;
	}else {
		t = h = n >> 1;
	}
	return q == 1 ? h : t;
}

void test_cases() {
	int g;
	read(g);
	for(int j = 0; j < g; ++j) {
		int i, n, q;
		read(i, n, q);
		if(i == 1) {
			cout << head(n, q);
		}else {
			cout << tail(n, q);
		}
		println();
	}
}

int main() {
	#ifndef ONLINE_JUDGE
		freopen("input.txt", "r", stdin);
		freopen("output.txt", "w", stdout);
	#endif
    ios::sync_with_stdio(0);
    cin.tie(0);
    int t = 1;
    cin >> t;
    FOR(t) test_cases();
    return EXIT_SUCCESS;
}

