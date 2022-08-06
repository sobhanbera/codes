#include <bits/stdc++.h>
using namespace std;

vector<string> vec(88418);

void performOperation(int i, int j, int k, int l, int index, string& s) {
	if(i == k && j == l) {
		if(s.length() == 48) {
			vecs.push_back(s);
		}
		s = "";
		return;
	}
	
	if(i+1 >= 0 && j >= 0 && i+1 <= 6 && j <= 6) {
		performOperation(i+1, j, 6, 6, s+'D');
	}
	if(i >= 0 && j+1 >= 0 && i <= 6 && j+1 <= 6) {
		performOperation(i, j+1, 6, 6, s+'R');
	}
}


int main() {
	string s;
	cin >> s;

	performOperation(0, 0, 6, 6, "");
	return 0;
}
