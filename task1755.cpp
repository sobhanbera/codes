#include <bits/stdc++.h>
using namespace std;

int main() {
	string s;
	cin >> s;
	int arr[26] = {0};
	for(char c : s) {
		arr[c - 'A']++;
	}
	int odd = 0, oddi = -1;
	for(int i = 0; i < 26; ++i) {
		if(arr[i] & 1) {
			odd++;
			oddi = i;
		}
		if(odd >= 2) {
			cout << "NO SOLUTION" << '\n';
			return 0;
		}
	}
	
	string res = "";
	for(int i = 0; i < 26; ++i) {
		if(arr[i] % 2 == 0) {
			string cur(arr[i]/2, (char)i+'A');
			res += cur;
		}
	}
	
	if(oddi>=0) {
		string cur(arr[oddi], (char) oddi+'A');
		res += cur;
	}

	for(int i = 25; i >= 0; --i) {
		if(arr[i] >= 0 && arr[i] % 2 == 0) {
			string cur(arr[i]/2, (char)i+'A');
			res += cur;
		}
	}

	cout << res << '\n';
    return EXIT_SUCCESS;
}

