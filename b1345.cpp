/*
**@author     : sobhanbera
**@since      : 19-10-2018
**@created on : 13-08-2020 22:19:44
*/
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;

#define FORUS(i, a, b, step) for(int i = a; step < 0 ? i > b : i < b; i += step)
#define FOR(a) FORUS(i, 0, a, 1)
#define FORR(a) FORUS(i, a, -1, -1)

#define cv(V, N) count(a.begin(), a.end(), N)
#define sv(V, N) binary_search(a.begin(), a.end(), N)
#define ca(A, N) count(A, A + sizeof(A) / sizeof(A[0]), N)
#define sa(A, N) binary_search(A, A + (sizeof(A) / sizeof(A[0])), N)

const int AAX = 1e9;
const int MOD = 1e9+9;

string to_string(bool b) { return b ? "true" : "false"; }
string to_string(const char* s) { return (string) s; }
string to_string(vector<bool> vec) {
	string res;
	for(int i = 0; i < vec.size(); ++i) res += char('0'+vec[i]);
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
	for(int i = 0; i < a.size(); ++i) cin >> a[i];
}

void debug() { cerr << endl; }

void println() {
	cout << "\n";
}
template<typename... A> void print(A... a) {
	((cout << a), ...);
}
template<typename... A> void prints(A... a) {
	((cout << a << " "), ...);
}
template<typename... A> void println(A... a) {
	((cout << a << endl), ...);
}
template<class A> void print(vector<A> a) {
	for(int i = 0; i < a.size(); ++i)
		prints(a[i]);
	println();
}
template<typename T, size_t n> void print(T const(& arr)[n]) {
	for(size_t i = 0; i < n; ++i)
		cout << arr[i] << ' ';
	println();
}

vector<int> cards;
void solve() {
	int n;
	ll sum = 0;
	read(n);
	while(n > 1) {
		int position = upper_bound(cards.begin(), cards.end(), n) - cards.begin();
		position--;
		n -= cards[position];
		if(position == 0) break;
		++sum;
	}
	println(sum);
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);

	cards.push_back(0); //since by this line main index will start from 1...
	int nrem = 0, h = 1, he = 1;
	while(1) {
		cards.push_back(2 + (2 * (h - 1)) + (nrem * 3));
		nrem += he, ++he, ++h;
		if(cards.back() >= AAX)
			break;
	}
	
	int t = 1;
	cin >> t;
	for(int i = 1; i <= t; ++i) solve();
    return 0;
}

