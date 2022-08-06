/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 08-09-2020 07:56:58 PM
\*/

//#pragma GCC optimize("O3")
#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace std;
using namespace __gnu_pbds;

const int AAX = 1e5;
const int MOD = 1e9+7;
template <typename T> using oset = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>;

#define FOR(i, a, b) for(int i = a; i < b; ++i)
#define REV(i, a, b) for(int i = a; i >= b; --i)
#define FORL(i, a, b) for(long long i = a; i < b; ++i)
#define REVL(i, a, b) for(long long i = a; i >= b; --i)

#define len(arr) (sizeof(arr) / sizeof(arr[0]))
#define sz(v) (v).size()
#define all(v) (v).begin(), (v).end()
#define sort(v) sort(v.begin(), v.end())
#define reverse(v) reverse(v.begin(), v.end())
#define mod %
#define pb push_back
#define mp make_pair

void debug() { cerr << endl; }
vector<string> vec_split(string s) {
	s += ',';
	vector<string> res;
	while(!s.empty()) {
		res.push_back(s.substr(0, s.find(',')));
		s = s.substr(s.find(',') + 1);
	}
	return res;
}
void debug_out(vector<string> __attribute__ ((unused)) args, __attribute__ ((unused)) int ind, __attribute__ ((unused)) int line) { debug(); }
template <typename A, typename... B> void debug_out(vector<string> args, int ind, int line, A a, B... b) {
	if(ind > 0)
		cerr << ", ";
	else
		cerr << "Line(" << line << ") :- ";
	stringstream ss;
	ss << a;
	cerr << '\n' << '\t' << args[ind] << " = " << ss.str();
	debug_out(args, ind + 1, line, b...);
}

#ifndef ONLINE_JUDGE
	#define dbg(...) debug_out(vec_split(#__VA_ARGS__), 0, __LINE__, __VA_ARGS__)
#else
	#define dbg(...) 42
#endif

template<class A> bool mmin(A& a, const A& b) {
	return a > b ? a = b, 1 : 0;
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

template<class A> void opera(A& a, long long num) {
	a += num;
}
template<class A> void opera(vector<A>& a, long long num) {
	for(A& i : a)
		opera(i, num);
}
template<class A, size_t n> void opera(A(&arr)[n], long long num) {
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

int sum, ex;
void solution(int time) {
	int a, b;
	read(a, b);
	sum = a;
	while(a) {
		sum += a/b;
		ex = a%b;
		a /= b + (ex/b);
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

