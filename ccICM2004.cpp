/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 27-08-2020 08:26:40 PM
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
template<typename I> void print(I fro, I to) { //I -> ForwardIterator(iterator).
    for(auto it = fro; it != to; ++it) cout << *it << ' ';
}
template<typename A> void print(A a) {
	cout << a;
}
template<typename A, typename... B> void print(A a, B... b) {
	cout << a;
	print(b...);
}

void repl(string& s, int l, int r, string o) {
	s.erase(l, r - l + 1);
	s.insert(l, o);
}

void solution() {
	int n, q;
	string s;

	read(n, s, q);
	for(int i = 0; i < q; ++i) {
		int x;
		read(x);
		if(x==1) {
			int L, R;
			string C;
			read(L, R, C);
			string o(10, 'f');
		}
	}
}

int main() {
	std::chrono::high_resolution_clock::time_point start = std::chrono::high_resolution_clock::now();
		
    ios::sync_with_stdio(0);
    cin.tie(0);
    int t = 1;
    cin >> t;
    for(int i = 1; i <= t; ++i) solution();
	
	cout << "\n\nTime Taken: " << chrono::duration_cast<chrono::duration<double>>(chrono::high_resolution_clock::now() - start).count() << " sec\n\n";
	
	return EXIT_SUCCESS;
}

