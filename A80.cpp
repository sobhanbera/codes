#include<iostream>
#include<cmath>
using namespace std;

bool isPrime(int n) {
	for(int i = 2; i <= sqrt(n); ++i)
		if(n % i == 0)
			return false;
	return true;
}

int main() {
	int n, m;
	cin >> n >> m;
	int ne = n + 1;
	while(true) {
		if(isPrime(ne)) break;
		ne++;
	}
	if(m == ne) {
		cout << "YES";
	}else {
		cout << "NO";
	}
    return 0;
}

