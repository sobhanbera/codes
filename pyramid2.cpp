#include<bits/stdc++.h>
using namespace std;

int main() {
    int row = 0, start = 65; // initializing with a value of 0 because by default the prorgam may give it any garbage positive value
    while(row < 1 || row > 26) {
        cout << "Enter a valid row between 1 and 26: ";
        cin >> row;
    }

    for(int i = 0; i <= row; ++ i) {
        for(int j = 0; j < row - i; ++j) cout << " "; // printing the spaces

        if(i != 0)  cout << "*"; // this is the first star in each row...

        for(int j = 0; j < i; ++j) cout << char(start + j) << "*"; // printing with the help of ASCII values

        cout << "\n";
    }

    return 0;
}
