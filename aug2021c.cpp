/*\
|*| @coder     : sobhan-bera
|*| @code_time : 25/08/21 22:32:25 pm
|*| @github    : https://github.com/sobhanbera
\*/

#include <bits/stdc++.h>
using namespace std;

#define FOR(i, a, b) for(int i = a; i < b; ++i)
#define REV(i, a, b) for(int i = a; i >= b; --i)
#define FORL(i, a, b) for(long long i = a; i < b; ++i)
#define REVL(i, a, b) for(long long i = a; i >= b; --i)
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
    stringstream ss;
    ss << a;
    cerr << '\n' << '\t' << args[ind] << " = " << ss.str();
    debug_out(args, ind + 1, line, b...);
}

#ifndef ONLINE_JUDGE
    #define dbg(...) debug_out(vec_split(#__VA_ARGS__), 0, __LINE__, __VA_ARGS__)
#else
    #define dbg(...) 42
#endif

template<class A> void read(A& a) {
    cin >> a;
}
template<class B, class... A> void read(B& b, A&... a) {
    read(b); read(a...);
}
template<class A> void read(vector<A>& a) {
    for(auto& i : a) read(i);
}

template<typename A> void print(A a) {
    cout << a;
}
template<typename A> void prints(A a) {
    print(a); print(' ');
}
template<typename A> void println(A a) {
    print(a); print('\n');
}
void println() { cout << '\n'; }
template<typename A, typename... B> void print(A a, B... b) {
    print(a); print(b...);
}
template<typename A, typename... B> void prints(A a, B... b) {
    prints(a); prints(b...);
}
template<typename A, typename... B> void println(A a, B... b) {
    println(a); println(b...);
}
template<typename I> void printi(I fro, I to) {
    for(auto it = fro; it != to; ++it) prints(*it);
}
template<class A> void print(vector<A>& a) {
    printi(all(a));
}

int g(int n) {
    int cnt = 0;
    for (int i = 1; i <= sqrt(n); i++) {
        if (n % i == 0) {
            if (n / i == i)
                cnt++;
            else
                cnt = cnt + 2;
        }
    }
    return cnt;
}

long long pow(long long a, long long n) {
    if(n == 0) return 1;
    else if(n == 1) return a % MOD;
    else {
        int p = pow(a, n / 2);
        if(n & 1) return (p * a * p) % MOD; // if the power is odd
        return (p * p) % MOD;
    }
}

void solution(int _time) {
    long long n, m, sum = 0;
    read(n, m);
    for(long long i = 1; i < n; ++i) {
        long long curr = (pow(i, m) * g(i)) % MOD;
        sum = (sum + curr) % MOD;
    }
    println(sum);
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

