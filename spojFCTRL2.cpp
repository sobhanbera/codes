/*\
|*| @author     : sobhanbera
|*| @code_since : 19-10-2018
|*| @created on : 25-08-2020 03:21:24 PM
\*/
#pragma GCC optimize("O3")
#include <bits/stdc++.h>
using namespace std;

#define FORUS(nr, a, b, step) for(int nr = a; step < 0 ? nr > b : nr < b; nr += step)
#define FOR(a) FORUS(nr, 0, a, 1)
#define FORR(a) FORUS(nr, a, -1, -1)

template<class A> void read(A& a) {
    cin >> a;
}
template<class B, class... A> void read(B& b, A&... a) {
    read(b);
    read(a...);
}

void test_cases() {
	int n;
	read(n);
	
	int index = 0, tempn = n, size = 0;
	int arr[200];
	while(tempn) {
		arr[index] = tempn % 10;
		tempn /= 10;
		++index;
		++size;
	}

	int xval = 0;
	index = 0;
	for(int i = 2; i < n; ++i) {
		tempn = 0;
		for(index = 0; index < size; ++index) {
			xval = arr[index] * i + tempn;
			arr[index] = xval % 10;
			tempn = xval / 10;
		}
		while(tempn) {
			arr[index] = tempn % 10;
            tempn /= 10;
            index++;
            ++size;
		}
	}
	for(int i = size - 1; i >= 0; --i) cout << arr[i];
	cout << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int t = 1;
    cin >> t;
    FOR(t) test_cases();
    return EXIT_SUCCESS;
}

