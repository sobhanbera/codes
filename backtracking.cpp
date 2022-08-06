#include <bits/stdc++.h>

using namespace std;

bool isValid(int arr[6][10], int i, int j, bool visited[6][10]) {
	return i >= 0 && j >= 0 && i < 6 && j < 10 && arr[i][j] == 1 && !visited[i][j];
}

int shortestPath(int arr[6][10], int i, int j, int x, int y, bool visited[6][10]) {
	if(!isValid(arr, i, j, visited)) return 100;
	if(i == x && j == y) return 0;

	visited[i][j] = true;
	int l = shortestPath(arr, i, j - 1, x, y, visited) + 1;
	int u = shortestPath(arr, i - 1, j, x, y, visited) + 1;
	int r = shortestPath(arr, i, j + 1, x, y, visited) + 1;
	int d = shortestPath(arr, i + 1, j, x, y, visited) + 1;
	visited[i][j] = false;

	return min(min(l, r), min(u, d));
}

int shortestPath(int arr[6][10], int i, int j, int x, int y) {
	bool visited[6][10];

	return shortestPath(arr, i, j, x, y, visited);
}

int main() {
	int arr[6][10] = {{1, 1, 1, 1, 0, 1, 1, 0, 1, 0},
					  {0, 1, 1, 0, 1, 0, 1, 1, 0, 0},
					  {0, 1, 1, 1, 0, 0, 1, 0, 0, 1},
					  {1, 0, 1, 0, 1, 1, 1, 0, 0, 0},
					  {0, 0, 1, 1, 1, 0, 0, 1, 0, 1},
					  {1, 1, 1, 0, 1, 0, 0, 0, 1, 1}};

	int s = shortestPath(arr, 0, 0, 0, 5);

	cout << s << endl;
	return 0;
}


