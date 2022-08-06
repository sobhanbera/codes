/***********************
@Author : sobhanbera
@Since : 19-10-2018
@CreatedOn : 
10-08-2020 00:17:05
************************/
//#include <bits/stdc++.h>
#include <iostream>
#include <iomanip>
#include <bitset>
#include <utility>
#include <functional>
#include <numeric>
#include <climits>
#include <cassert>
#include <cstring>
#include <tuple>
#include <array>
#include <vector>
#include <list>
#include <set>
#include <map>
#include <stack>
#include <queue>
#include <deque>
#include <iterator>
#include <algorithm>
#include <cmath>
#include <ext/pb_ds/assoc_container.hpp>
#include <ext/pb_ds/tree_policy.hpp>
using namespace __gnu_pbds;
using namespace std;

template <typename T> using oset = tree<T, null_type, less<T>, rb_tree_tag, tree_order_statistics_node_update>; 

string to_string(char ch) {
	return string(1, ch);
}

string to_string(string str) {
	return str;
}

string to_string(bool b) {
	return b ? "true" : "false";
}

string to_string(const char* s) {
	return (string) s;
}

string to_string(vector<bool> vec) {
	string res;
	for(int i = 0; i < vec.size(); ++i) res += char('0'+vec[i]);
	return res;
}

template <size_t N>
string to_string(bitset<N> bi) {
	string res = "";
	for (size_t i = 0; i < N; i++) res += static_cast<char>('0' + bi[i]);
	return res;
}

template<class A> string to_string(A a) {
    bool fi=1;
    string res;
    for(auto& x : a) {
		if(!fi)
			res+=' ';
		fi=0;
		res+=to_string(x);
	}
    return res;
}


template<class T> void read(T& x) {
	cin >> x;
}

template<class A> void write(A x) {
	cout << to_string(x);
}

template<class A, class... B> void write(const A& a, const B&... b) { 
	write(a); write(b...);
}

void print() {
	cout << "\n";
}

void println() {
	print();
}

template<class A, class... B> void print(const A& a, const B&... b) { 
	write(a);
	if(sizeof...(b))
		write(' ');
	print(b...);
}

template<class A, class... B> void println(const A& a, const B&... b) { 
	write(a);
	if(sizeof...(b))
		write("\n");
	println(b...);
}

template<class A> void print(vector<A> vec) {
	for(int i = 0; i < vec.size(); ++i)
		cout << vec[i] << " ";
	cout << "\n";
}

template<class A> void read(vector<A>& vec) {
	for(int i = 0; i < vec.size(); ++i)
		cin >> v[i];
}

void solve() {
	int n, m;
	read(n, m);
	vector<string> v(n);
   	read(v);	
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int t = 1;
	cin >> t;
	for(int i = 1; i <= t; ++i) {
		//write("Case #", i, ": ");
		solve();
	}
    return 0;
}
