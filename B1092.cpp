/*
 *  author:sobhanbera
*/
#pragma GCC optimize("O3")
#include <bits/stdc++.h>
using namespace std;

typedef long long ll;
typedef long double ld;

#define pb push_back
#define lb lower_bound
#define ub upper_bound
#define setbits(x) __builtin_popcountll(x)
#define zrobits(x) __builtin_ctzll(x)
#define asort(col) sort(col.begin(), col.end())
#define dsort(col, d) sort(col.begin(), col.end(), greater<int>())
#define For(i, a, b, st) for(int i = a; st > 0 ? i < b : i > b; i += st)
#define FOR(e) For(i, 0, e, 1)
#define FOR1(a, b) For(i, a, b, 1)

const int MOD = 1e9+7;
const int MAX = 2e5+5;
const ll INF = 1e18;
const ld PI = acos((ld)-1);
mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());

string toString(const string& s) { return '"' + s + '"'; }
string toString(bool b) { return b ? "true" : "false"; }
string toString(const char* s) { return toString((string) s); }

void sort(int (&arr)[6]) { int n = sizeof(arr) / sizeof(arr[0]); sort(arr, arr + n); }

template<class t, class u> void smax(t& a, u b) { if(a < b)a = b; }
template<class t, class u> void smin(t& a, u b) { if(a > b)a = b; }

template<typename... T> void read(T&... val) { ((cin >> val + " "), ...); }
template<typename... T> void write(char c, T... val) { ((cout << val << c), ...); }
template<typename... T> void write(T... val) { ((cout << val), ...); }

int z, s, arr[MAX];

void solve() {

}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, sum = 0;
    cin >> n;
    int arr[n];
    for(int i = 0; i < n; ++i) {
        cin >> arr[i];
    }
    sort(arr, arr+n);
    for(int i = 0; i < n; i += 2) {
        sum += arr[i+1] - arr[i];
    }
    cout << sum;
    return 0;
}

