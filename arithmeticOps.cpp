#include <bits/stdc++.h>
using namespace std;

int main()
{
    float a,b;
    int operation;
    cout << "Enter value of a =";
    cin >> a;
    cout << "Enter value of b =";
    cin >> b;

    cout << "Choose operation \n 1 for addition \n 2 for subtraction \n 3 for multiplication \n 4 for division \n";
    cin >> operation;

    switch(operation)
    {
        case 1:
          cout << "Addition is = " << a+b;
          break;

        case 2:
          cout << "Subtraction is = " << a-b;
          break;

        case 3:
          cout << "Multiplication is " << a*b;
          break;

        case 4:
          cout << "Division is = " << a/b;
          break;

        default :
          cout << "Invalid choice";
          break;

    }
    return 0;
}
