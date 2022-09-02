#include<bits/stdc++.h>
using namespace std;

void debug() { cerr << endl; }
vector<string> split_vector(string s) {
	s += ',';
	vector<string> res;
	while(!s.empty()) {
		res.push_back(s.substr(0, s.find(',')));
		s = s.substr(s.find(',') + 1);
	}
	return res;
}
void debug(vector<string> __attribute__ ((unused)) args, __attribute__ ((unused)) int ind, __attribute__ ((unused)) int line) { debug(); }
template <typename A, typename... B> void debug(vector<string> args, int ind, int line, A a, B... b) {
	if(ind > 0) cerr << ", "; else cerr << "Line(" << line << ") :-";
	stringstream ss; ss << a; cerr << '\n' << '\t' << args[ind] << " = " << ss.str();
	debug(args, ind + 1, line, b...);
}
#define dbg(...) debug(split_vector(#__VA_ARGS__), 0, __LINE__, __VA_ARGS__)

