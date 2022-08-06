#include <iostream>

using namespace std;

void operator==(int i, char c) {
	return i == c;
}

int main() {
	int i = 48;
	char c = '1';
	cout << i == c;
	return 0;
}
