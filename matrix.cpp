#include <bits/stdc++.h>
using namespace std;

int main() {
	// the real matrix variable
	int mat[2][2];
	// taking the input for each element present in matrix
	for(int i = 0; i < 2; ++i)
		for(int j = 0; j < 2; ++j) {
            cout << "Enter element at index " << i+1 << ' ' << j+1 << ": ";
			cin >> mat[i][j];
	// finding the determinant
	int determinant = mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
	// by formulae
	int trace = -mat[0][0] - mat[1][1];
	int eigen1 = ((-trace + sqrt((trace * trace) - (4 * determinant))) / 2);
	int eigen2 = ((-trace - sqrt((trace * trace) - (4 * determinant))) / 2);
	// printing the results
	cout << "The eigen values are: " << eigen1 << " and " << eigen2;


	return 0;
}

