/*\
|*|  @author     : sobhanbera
|*|  @since      : 19-10-2018
|*|  @created on : 23-08-2020 08:02:31 PM
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

void debug() { cerr << endl; }
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

template<class A> void read(A& a) {
	cin >> a;
}
template<class B, class... A> void read(B& b, A&... a) {
	read(b);
	read(a...);
}
template<class A> void read(vector<A>& a) {
	for(auto& i : a) read(i);
}

int n, k;
vector<int> v;
bool isAvailable(double m) {
	int sum = 0;
	for(int i : v)
		sum += floor(i / m);
	return sum >= k;
}

void test_cases() {
	read(n, k);
	v.resize(n);
	read(v);

	double l = 0;
	double r = 1e8;
	for(int i = 0; i < 75; ++i) {
		double m = (r + l) / 2;
		if(isAvailable(m)) {
			l = m;
		}else {
			r = m;
		}
	}
	cout << setprecision(20) << l << endl;
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	int t = 1;
	//cin >> t;
	for(int i = 1; i <= t; ++i) test_cases();
    return EXIT_SUCCESS;
}

