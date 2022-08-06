#include <bits/stdc++.h>
using namespace std;
int main() {
	int t;
	cin >> t;
	while(t--) {
		int a, b;
		cin >> a >> b;
		int a2 = (2*a) - b;
		int b2 = (2*b) - a;
		if(a2 >= 0 && b2 >= 0
				&& a2 % 3 == 0 && b2 % 3 == 0) {
			cout << "YES" << '\n';
		}else {
			cout << "NO" << '\n';
		}
	}
    return EXIT_SUCCESS;
}
