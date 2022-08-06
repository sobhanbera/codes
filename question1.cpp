#include <bits/stdc++.h>
using namespace std;

int main() {
    freopen("input_nos.txt", "r", stdin);
    freopen("output_nos.txt", "w", stdout);

    int t, pos = 0, neg = 0;
    float pos_avg = 1, neg_avg = 1;
    cin >> t;
    while (t--) {
        float x;
        cin >> x;
        if (x > 0) {
            pos++;
            pos_avg += x;
        } else {
            neg++;
            neg_avg += x;
        }
    }
    cout << "Positive numbers: " << pos << endl;
    cout << "Negative numbers: " << neg << endl;
    cout << "Positive average: " << pos_avg / pos << endl;
    cout << "Negative average: " << neg_avg / neg << endl;
    return 0;
}

