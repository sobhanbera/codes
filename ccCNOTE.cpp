/*\
|*| @coder     : sobhan-bera
|*| @code_time : 2022-05-17 16:52
|*| @github    : https://github.com/sobhanbera
\*/

#include <bits/stdc++.h>
using namespace std;

#define FOR(i, a, b) for(int i = a; i < b; ++i)
#define REV(i, a, b) for(int i = a; i >= b; --i)
#define FORL(i, a, b) for(long long i = a; i < b; ++i)
#define REVL(i, a, b) for(long long i = a; i >= b; --i)
#define ll long long
const int MAX = 1e5;
const int MOD = 1e9+7;

void debug() { cerr << endl; }
vector<string> vec_split(string s) {
	s += ',';
	vector<string> res;
	while(!s.empty()) {
		res.push_back(s.substr(0, s.find(',')));
		s = s.substr(s.find(',') + 1);
	}
	return res;
}
void debug_out(vector<string> __attribute__ ((unused)) args, __attribute__ ((unused)) int ind, __attribute__ ((unused)) int line) { debug(); }
template <typename A, typename... B> void debug_out(vector<string> args, int ind, int line, A a, B... b) {
	if(ind > 0) cerr << ", ";
	else cerr << "Line(" << line << ") :- ";

	stringstream ss; ss << a;
	cerr << '\n' << '\t' << args[ind] << " = " << ss.str();
	debug_out(args, ind + 1, line, b...);
}

#ifndef ONLINE_JUDGE
	#define dbg(...) debug_out(vec_split(#__VA_ARGS__), 0, __LINE__, __VA_ARGS__)
#else
	#define dbg(...) 42
#endif

void solution(int _time) {
	int x, y, k, n, ans = 0;
	cin >> x >> y >> k >> n;

	int req = x - y;
	for(int i = 0; i < n; ++i) {
		int p, c;
		cin >> p >> c;
		if(p >= req && c <= k) ans++;
	}
	if(ans || req <= 0) cout << "LuckyChef" << endl;
	else cout << "UnluckyChef" << endl;
}

int main() {
	ios::sync_with_stdio(false);
	cin.tie(nullptr);

	int t = 1;
	cin >> t;
	for(int nr = 1; nr <= t; ++nr) {
		//print("Case #", nr, ": ");
		solution(nr);
	}
	return 0;
}

