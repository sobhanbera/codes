/*\
|*|  @author     : sobhanbera
|*|  @since      : 19-10-2018
|*|  @created on : 19-08-2020 02:17:39 PM
\*/
#include <bits/stdc++.h>
#include <iostream>
#include <algorithm>
#include <random>
#include <chrono>
#include <cassert>
#include <functional>
#include <complex>
#include <cstdlib>
#include <cstdio>
#include <string>
#include <cstring>
#include <sstream>
#include <cmath>
#include <vector>
#include <list>
#include <set>
#include <unordered_set>
#include <map>
#include <unordered_map>
#include <queue>
#include <bitset>
using namespace std;

#define FORUS(i, a, b, step) for(int i = a; step < 0 ? i > b : i < b; i += step)
#define FOR(a) FORUS(i, 0, a, 1)
#define FORR(a) FORUS(i, a, -1, -1)

#define cv(V, N) count(a.begin(), a.end(), N)
#define sv(V, N) binary_search(a.begin(), a.end(), N)
#define ca(A, N) count(A, A + sizeof(A) / sizeof(A[0]), N)
#define sa(A, N) binary_search(A, A + (sizeof(A) / sizeof(A[0])), N)

const unsigned long long INF = 0xffffffffffffffff; //18446744073709551615
const int AAX = 0x3B9ACA09;              //1e9+9;
const int MOD = 0x3B9ACA00;             //1e9;

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

void test_cases() {
	int k;
	read(k);
	vector<int> v(k+1);
	int n = k + 1, m = 1 + (n - 2) * 2;
	prints(n, m);
	println();
	
	for(int j = 2; j <= n; ++j) {
		prints(1, j);
		println();
	}
	for(int i = 2; i < n; ++i) {
		prints(i, n);
		println();
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int t = 1;
	//cin >> t;
	for(int i = 1; i <= t; ++i) test_cases();
    return EXIT_SUCCESS;
}

