/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 02-09-2020 08:39:40 PM
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

#define dbg(x) cerr << (#x) << " -> " << (x) << endl
#define len(arr) (sizeof(arr) / sizeof(arr[0]))
#define sz(v) (v).size()
#define all(v) (v).begin(), (v).end()
#define mod %

void debug() { cerr << endl; }
template<class A, class... B> void debug(A a, B... b) {
	dbg(a); debug(b...);
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
template<typename I> void printi(I fro, I to) {
    for(auto it = fro; it != to; ++it)
		prints(*it);
}
template<class A> void print(vector<A>& a) {
    printi(all(a));
}

bool check(string real, string w, int x) {
	string res = real;
	for(int i = 0; i < res.size(); ++i) {
		if(i - x >= 0 and w[i-x] == '1' or i + x < real.size() and w[i+x] == '1') {
			res[i] = '1';
		}else {
			res[i] = '0';
		}
	}
	return res == real;
}

void solution(int time) {
	string s;
	read(s);
	int x;
	read(x);
	int size = s.size();
	string res(size, '1');

	for(int i = 0; i < size; ++i) {
		if(s[i] == '0') {
			if(i - x >= 0) {
				res[i-x] = '0';
			}
			if(i + x < size) {
				res[i+x] = '0';
			}
		}
	}
	if(check(s, res, x)) {
		println(res);
		return;
	}
	println("-1");
}

int main() {
	ios::sync_with_stdio(false);
    cin.tie(nullptr);
	
    int t = 1;
	read(t);
    for(int nr = 1; nr <= t; ++nr) {
		//print("Case #", nr, ": ");
		solution(nr);
	}
	
	return EXIT_SUCCESS;
}

