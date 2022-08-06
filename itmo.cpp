/*\
|*|  @author     : sobhanbera
|*|  @since      : 19-10-2018
|*|  @created on : 22-08-2020 09:35:14 PM
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

int searchLeft(int arr[], int x, int n) {
	int l = -1, r = n, m;
	while(l + 1 < r) {
		m = l + (r - l) / 2;
		if(arr[m] <= x) {
			l = m;
		}else {
			r = m;
		}
	}
	return l;
}
int searchRight(int arr[], int x, int n) {
	int l = -1, r = n, m;
	while(l + 1 < r) {
		m = l + (r - l) / 2;
		if(arr[m] >= x) {
			r = m;
		}else {
			l = m;
		}
	}
	return r;
}

void test_cases() {
	int n, q;
	read(n);
	int arr[n];
	for(int& i : arr) {
		read(i);
	}
	sort(arr, arr + n);
	
	read(q);
	for(int i = 0; i < q; ++i) {
		int l, r;
		read(l, r);
		int l_index = searchRight(arr, l, n);
		int r_index = searchLeft(arr, r, n);
		cout << r_index - l_index + 1 << endl;
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

