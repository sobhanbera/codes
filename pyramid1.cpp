#include<bits/stdc++.h>
using namespace std;

int main() {
    int row = 2;
    while(row < 3 || row > 30) {
        cout << "Enter a valid row between 3 and 30: ";
        cin >> row;
    }

    for(int i = row; i > 0; --i) {
        for(int j = 0; j < row - i; ++j) cout << "  ";

        for(int j = i; j <= 2 * i - 1; ++j) cout << "* ";

        for(int j = 0; j < i-1; ++j) cout << "* ";

        cout << '\n';
    }

    return 0;
}
