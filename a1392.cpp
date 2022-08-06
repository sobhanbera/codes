#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

int os(string s) {
    int res = 0;
    for(char c : s) {
        if(c=='o') {
            res++;
        }
    }
    return res;
}

int main()
{
    int N;
    int M;
    cin >> N >> M;
    int S;
    int x = 0;
    
    for(int i = 0; i < N; ++i) {
        string s;
        cin >> s;
        cout << "OS" << os(s) << endl;
        x += os(s);
    }


    // Write an answer using cout. DON'T FORGET THE "<< endl"
    // To debug: cerr << "Debug messages..." << endl;

    cout << x * S << endl;
}
