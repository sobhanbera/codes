// Write a computer program to calculate a frequency of occurrence of each face when a sixsided dice is rolled randomly
// take the number of throw as input from the user
// and show that the probability of occurrence of each face of the die is approximately 1/6
#include<bits/stdc++.h>
using namespace std;

int main() {
    int freq[6] = {0};
    int n;
    cout << "Enter the number of throws: ";
    cin >> n;
    for (int i = 0; i < n; i++) {
        freq[rand() % 6]++;
    }
    cout << "\nThe probability of each faces are: \n";
    for (int i = 0; i < 6; i++) {
        cout << "Face " << i + 1 << ": " << freq[i] << endl;
    }
    // probability of occurrence of each face of the die is approximately 1/6
    cout << "\nThe probability of occurrence of each face of the die is approximately 1/6:\n";
    for (int i = 0; i < 6; i++) {
        cout << "Face " << i + 1 << ": " << freq[i] * 1.0 / n << endl;
    }
    return 0;
}

