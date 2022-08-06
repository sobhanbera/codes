/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 26-08-2020 10:57:36 PM
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

int contains(vector<int> v, int k) {
	int l = 0;
	int r = v.size() - 1;
	while(l <= r) {
		int m = (l + r) / 2;
		if(v[m] == k) {
			return m;
		}else if(v[m] >= k) {
			r = m-1;
		}else {
			l = m+1;
		}
	}
	return -1;
}

void test_cases() {
    int n, k;
	read(n);
	vi v(n);
	read(v);
	read(k);
	k = v[k-1];
	sort(all(v));
	int con = contains(v, k);
	if(con >= 0) {
		cout << con + 1;
	}else {
		cout << upper_bound(all(v), k) - v.begin();
	}
	println();
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

