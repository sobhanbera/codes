// formulae of eigen values is here - https://miro.medium.com/max/1400/1*GZf1-Jarwqw4I1yynbUDDA.png
/**
 * Example Matrix:
 *     -     -
 * A = | 0 3 |
 *     | 1 2 |
 *     -     -
 * for eigen values
 *
 * => | A - λI | = 0
 *
 * => | 0-λ   3  | = 0
 *    |  1   2-λ |
 * => {(0-λ) * (2-λ)} - (3 * 1) = 0
 *
 * after solving the above we get the following equation:
 * => λ² - 2λ - 3 = 0
 *
 * now for value of λ we have to use quadratic formula -> (-b ± √(b² - 4ac)) / 2a
 * => λ = (-(-2) ± √(-2² - 4 * 1 * -3)) / 2 * 1
 * => λ = (2 ± √4 - -12) / 2
 * => λ = (2 ± √16) / 2
 * => λ = (2 ± 4) / 2
 * => λ = (2 + 4) / 2 and (2 - 4) / 2
 * => λ = 3 and -1
 * these are eigen values
 */

#include <bits/stdc++.h>
using namespace std;

int main() {
	// the real matrix variable
	int mat[2][2];
	// taking the input for each element present in matrix
	for(int i = 0; i < 2; ++i)
		for(int j = 0; j < 2; ++j)
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

