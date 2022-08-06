/***********************
@Author : sobhanbera
@Since : 19-10-2018
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
using namespace std;

string toString(const string& s) {
	return '"' + s + '"';
}

string toString(bool b) {
	return b ? "true" : "false";
}

string toString(const char* s) {
	return toString((string) s);
}

string toString(vector<bool> vec) {
	bool f = true;
	string res = "{";
	for (int i = 0; i < static_cast<int>(vec.size()); i++) {
		if (!f) res += ", ";
		f = false;
		res += to_string(vec[i]);
	}
	res += "}";
	return res;
}

template <size_t N>
string toString(bitset<N> bi) {
	string res = "";
	for (size_t i = 0; i < N; i++) res += static_cast<char>('0' + bi[i]);
	return res;
}

template <typename A, typename B>
string to_string(pair<A, B> pa) {
	return "(" + to_string(pa.first) + ", " + to_string(pa.second) + ")";
}

void solve() {
	
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	int t = 1;
	cin >> t;
	while(t--)
		solve();
    return 0;
}

