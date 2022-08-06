/*\
|*|  @author     : sobhanbera
|*|  @since      : 19-10-2018
|*| @created on : 31-08-2020 06:30:45 PM
\*/
#include <bits/stdc++.h>
using namespace std;

int main() {
	int n;
	cin >> n;
	set<int> s;
	while(n--) {
		int x; cin >> x;
		s.insert(x);
	}
	cout << s.size();
    return EXIT_SUCCESS;
}

