#include <iostream>
#include<complex>
#include<math.h>
using namespace std;

int main () {
    float d, r, c;
    cout << "Enter the real part of complex number: ";
    cin >> r;
    cout << "Enter the complex part of the number: ";
    cin >> c;

    d = sqrt((r * r) + (c * c));
    cout <<"\nModulus of the complex number|z|: " << d << '\n';

    complex<double> complexnumber (r, c);
    cout <<"\nThe argument of " << complexnumber << " is: ";
    cout << arg(complexnumber) << endl;



    return 0;

}

