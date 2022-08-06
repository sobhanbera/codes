/*-----> @author : sobhanbera <-----*/
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;

#define FORUS(i, a, b, step) for(int i = a; step < 0 ? i > b : i < b; i += step)
#define FOR(a) FORUS(i, 0, a, 1)
#define FORR(a) FORUS(i, a, -1, -1)

#define every(a) a.begin(), a.end()
#define vs(A, N) binary_search(every(A), N)
#define as(A, N) binary_search(A, A + (sizeof(A) / sizeof(A[0])), N)

const int max = 1e9;
const int mod = 1e9+9;

string to_string(bool b) {
	return b ? "true" : "false";
}
string to_string(const char* s) {
	return (string) s;
}
string to_string(vector<bool> vec) {
	string res;
	for(int i = 0; i < vec.size(); ++i) res += char('0'+vec[i]);
	return res;
}
template <size_t N>
string to_string(bitset<N> bi) {
	string res = "";
	for (size_t i = 0; i < N; i++) res += static_cast<char>('0' + bi[i]);
	return res;
}
template<class A> string to_string(A a) {
    bool fi=1;
    string res;
    for(auto& x : a) {
		if(!fi) res+=' ';
		fi=0;
		res+=to_string(x);
	}
    return res;
}

void solve() {
	int n;
	cin >> n;
	int arr[n];
	for(int i = 0; i < n; ++i)
		cin >> arr[i];
	sort(arr, arr + n);
	for(int i = 0; i < n - 1; ++i) {
		if(abs(arr[i] - arr[i+1]) <= 1) {
			continue;
		}else {
			cout << "NO" << endl;
			return;
		}
	}
	cout << "YES" << endl;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(0);
	
	int t = 1;
	cin >> t;
	for(int i = 1; i <= t; ++i)
		solve();
    return 0;
}
