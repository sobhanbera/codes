#include<bits/stdc++.h>
using namespace std;

int main() {
    // calculate first 5000 digits of PI
    int n = 5000;
    double pi = 0;
    for (int i = 0; i < n; i++) {
        pi += pow(-1, i) * (1.0 / (2 * i + 1));
    }
    pi *= 4;
    cout << pi << endl;

    return 0;
}
