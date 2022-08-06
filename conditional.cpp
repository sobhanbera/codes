#include<bits/stdc++.h>
using namespace std;

int main() {
    int a, b, c, d, e, l1, l2, lf;
    cout << "Enter value of a: "; cin >> a;
    cout << "Enter value of b: "; cin >> b;
    cout << "Enter value of c: "; cin >> c;
    cout << "Enter value of d: "; cin >> d;
    cout << "Enter value of e: "; cin >> e;

    l1 = a > b ? a : b;
    l2 = c > d ? c : d;
    lf = l1 > l2 ? l1 : l2;

    int finalLarge = e > lf ? e : lf;
    cout << "\nThe largest among 5 numbers is: " << finalLarge;

    return 0;
}
