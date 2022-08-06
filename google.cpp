/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 28-08-2020 09:45:52 PM
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

const int AAX = 1e5;
const int MOD = 1e9+7;
template <typename T> using oset = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

#define FORUS(a, b, st) for (int i = (a); (st) < 0 ? i >= (b) : i <= (b); i += (st))
#define FOR(to) FORUS(0, to, 1)
#define FORF(a, b) FORUS(a, b, 1)
#define REV(to) FORUS(to, 0, -1)
#define REVF(a, b) FORUS(a, b, -1)
#define dbg(x) cerr << (#x) << " -> " << (x) << endl
#define len(arr) (sizeof(arr) / sizeof(arr[0]))
#define sz(v) (v).size()
#define all(v) (v).begin(), (v).end()

void debug() { cerr << endl; }
string to_string(bool b) { return b ? "true" : "false"; }
string to_string(const char* s) { return (string) s; }
string to_string(const vector<bool>& vec) {
    string res;
    for(auto && i : vec) res += char('0'+i);
    return res;
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
template<typename A> void prints(A a) { print(a); print(' '); }
template<typename A> void println(A a) { print(a); print('\n'); }
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
	int arr[n];
	int cur = -5;
	int dif = -1, sum =0;
	read(arr[0]);
	for(int i = 1; i <= n; ++i) {
		read(arr[i]);
		if(abs(arr[i] - arr[i-1] == cur)) {
			sum++;
		}else {
			dif = max(dif, sum);
			sum = 1;
			cur = abs(arr[i] - arr[i-1]);
		}
	}
	println(dif);
}

int main() {
	ios::sync_with_stdio(0);
    cin.tie(0);
    int t = 1;
	read(t);
    for(int nr = 1; nr <= t; ++nr) {
		//print("Case #", nr, ": ");
		solution(nr);
	}
	return EXIT_SUCCESS;
}

