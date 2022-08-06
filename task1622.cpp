#include <bits/stdc++.h>
using namespace std;

void performCombinations(set<string>& se, string s, int l, int r) {
	if(l == r) {
		se.insert(s);
		return;
	}
	for(int i = l; i <= r; ++i) {
		swap(s[l], s[i]);
		performCombinations(se, s, l+1, r);
		swap(s[l], s[i]);
	}
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	string s;
	cin >> s;
	set<string> se;
	performCombinations(se, s, 0, s.length() - 1);
	cout << se.size() << '\n';
	for(string str : se) {
		cout << str << '\n';
	}
	return 0;
}
