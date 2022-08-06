#include<bits/stdc++.h>
using namespace std;

int main() {
    int x, y, z;
    cout << "Enter value of x: ";
    cin >> x;
    cout << "Enter value of y: ";
    cin >> y;
    cout << "Enter value of z: ";
    cin >> z;

    cout << "\nSpherical coordinates are: \nρ - " << x*x + y*y + z*z << "\nθ - " << atan(y / x) << "\nφ - " << acos(z / sqrt(x*x + y*y + z*z)) << '\n';
    return 0;
}

