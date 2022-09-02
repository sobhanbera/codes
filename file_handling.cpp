// file handling using fstream
#include<bits/stdc++.h>
using namespace std;

int main() {
    cout << "Content of the code which is being executed is: \n\n";

    // open file in read mode
    fstream file("file_handling.cpp");
    // check if file is open
    if(file.is_open()) {
        // read file line by line
        string line;
        while(getline(file, line)) {
            cout << line << endl;
        }
        // close file
        file.close();
    } else {
        cout << "File not found" << endl;
    }

    file.open("test.cpp", ios::out);
    if(file.is_open()) {
        string line;
        cout << "Enter lines to write to file" << endl;
        cin >> line;
        file << line;
        file.close();
    } else {
        cout << "File not found" << endl;
    }

    cout << "Content of the test file\n";
    file.open("test.cpp", ios::in);
    if(file.is_open()) {
        string line;
        while(getline(file, line)) {
            cout << line << endl;
        }
        file.close();
    } else {
        cout << "File not found" << endl;
    }
    return 0;
}
