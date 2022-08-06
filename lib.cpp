#include <iostream>
#include <cstdlib>
#include <string>

using namespace std;                                                        //to use standard library...

//structure
struct Structure_Name {
};

const int cat = 212;

int solve() {
	const int cat = 1;
	cout << cat;
	cout << myglobal::cat;
	return 0;
}

int main() {
	solve();
	string s;                                                               //string -> string library...
	return EXIT_SUCCESS;                                                   //EXIT_SUCCESS -> cstdlib library...
}

