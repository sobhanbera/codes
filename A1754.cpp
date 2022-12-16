#include<bits/stdc++.h>
using namespace std;

bool ans(string s, int n) {
    int cntq = 0, cnta = 0;
    for(int j = 0; j < s.length(); j++) {
        if(s[j] == 'Q') ++cntq;
        if(s[j] == 'A') ++cnta;

        if(cnta > cntq) {
            cnta = 0;
            cntq = 0;
        }
    }

    return cntq == cnta;
}

int main() {
    int t;
	cin >> t;

    while(t--) {
        int n;
        string s;
		cin >> n;
        cin >> s;

        if(ans(s, n)) cout << "Yes" << endl;
        else cout << "No" << endl;
	}
}
