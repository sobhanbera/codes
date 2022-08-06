/*\
|*|  @author     : sobhanbera
|*|  @since      : 19-10-2018
|*|  @created on : 21-08-2020 01:24:49 PM
\*/
#pragma GCC optimize("O3")
#include <bits/stdc++.h>
using namespace std;

#define FORUS(nr, a, b, step) for(int nr = a; step < 0 ? nr > b : nr < b; nr += step)
#define FOR(a) FORUS(nr, 0, a, 1)
#define FORR(a) FORUS(nr, a, -1, -1)
#define dbg(x) cerr << (#x) << " -> " << (x) << endl

const unsigned long long INF = 0xffffffffffffffff; //18446744073709551615
const int AAX = 0x3B9ACA09;                       //1e9+9;
const int MOD = 0x3B9ACA00;                      //1e9;

string to_string(bool b) { return b ? "true" : "false"; }
string to_string(const char* s) { return (string) s; }
string to_string(vector<bool> vec) {
	string res;
	for(unsigned int i = 0; i < vec.size(); ++i) res += char('0'+vec[i]);
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

template<typename... A> void write(A... a) {
	((cout << a), ...);
}
template<typename... A> void writes(A... a) {
	((cout << a << " "), ...);
}

template<typename... A> void print(A... a) {
	((cout << a), ...);
	cout << endl;
}
template<typename... A> void prints(A... a) {
	((cout << a << " "), ...);
	cout << endl;
}

void println() { cout << "\n"; }
template<typename... A> void println(A... a) {
	((cout << a << endl), ...);
}
template<class A> void print(vector<A> a) {
	for(int i = 0; i < a.size(); ++i) {
		if(i != a.size() - 1) {
			prints(a[i]);
			continue;
		}
		print(a[i]);
	}
}
template<typename T, size_t n> void print(T const(& arr)[n]) {
	for(size_t i = 0; i < n; ++i)
		cout << arr[i] << ' ';
}

bool isGood(int i, int j, int r, int c) {
	return i >= 0 && j >= 0 && i < r && j < c;
}

bool good(int i, int j, int r, int c, vector<string> v) {
	if(isGood(i+1, j, r, c)) if(v[i+1][j] == 'W') return false;
	if(isGood(i-1, j, r, c)) if(v[i-1][j] == 'W') return false;
	if(isGood(i, j+1, r, c)) if(v[i][j+1] == 'W') return false;
	if(isGood(i, j-1, r, c)) if(v[i][j-1] == 'W') return false;
	return true;
}

void test_cases() {
	int row, col;
	read(row, col);
	vector<string> vs(row);
	read(vs);

	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			if(vs[i][j] == 'S' && !good(i, j, row, col, vs)) {
					println("No");
					return;
			}
		}
	}

	for(int i = 0; i < row; ++i)
		for(int j = 0; j < col; ++j)
			if(vs[i][j] == '.')
				vs[i][j] = 'D';

	println("Yes");
	for(string s : vs) {
		println(s);
	}

}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int t = 1;
	//cin >> t;
	for(int i = 1; i <= t; ++i) test_cases();
    return EXIT_SUCCESS;
}

