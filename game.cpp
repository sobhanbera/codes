#include <iostream>
#include <list>
#include <vector>

using namespace std;

int main() {
	int n, m;
	cin >> n >> m;
	while(n < m) {
		cout << "n : ";
		cin >> n;
		cout << "m : ";
		cin >> m;
		if(((n % m) + (m % n)) == 0) {
			cout <<  "It's a good number.";
		}
	}
	return 0;
}

