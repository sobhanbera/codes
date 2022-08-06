#include <bits/stdc++.h>

using namespace std;

//adjacency list implementation...
void addNode(vector<int> v[], int a, int b) {
	v[a].push_back(b);
	v[b].push_back(a);
}

//void printNodes(vector<int> v[], int s) {
	//for(int i = 0; i < s; ++i) {
		//cout << "\n Adjacency list of vertex " << i << "\n head "; 
        //for (int x : v[i])
           //cout << "-> " << x;
        //printf("\n");
	//}
//}

void printNodes(vector<int> v[], int s) {
	for(int i = 0; i < s; ++i) {
		cout << "\n Adjacency list of vertex " << i << "\n head "; 
        for (int x : v[i])
           cout << "-> " << x;
        printf("\n");
	}
}

// A utility function to do DFS of graph 
// recursively from a given vertex u. 
void DFSUtil(int u, vector<int> adj[], vector<bool> &visited) {
    visited[u] = true;
    cout << u << " ";
    for (int i=0; i<adj[u].size(); i++)
        if (visited[adj[u][i]] == false)
            DFSUtil(adj[u][i], adj, visited);
}

// This function does DFSUtil() for all
// unvisited vertices.
void DFS(vector<int> adj[], int V) {
    vector<bool> visited(V, false);
    DFSUtil(1, adj, visited);
}

//for global variable arr[][] adjacency matrix implementation...
int arr[5][5];
void addNode(int a, int b) {
	arr[a][b] = 1;
	arr[b][a] = 1;
}

void printNodes() {
	for(int i = 0; i < 5; ++i) {
		for(int j = 0; j < 5; ++j) {
			cout << arr[i][j] << " ";
		}
		cout << "\n";
	}
}

//weighted graph..
void addW(vector<pair<int, int>> vp[], int a, int b, int d) {
	vp[a].push_back(make_pair(b, d));
	vp[b].push_back(make_pair(a, d));
}

void printW(vector<pair<int, int>> vp[], int n) {
	for(int i = 0; i < n; ++i) {
		cout << "For " << i << endl;
		for(auto it = vp[i].begin(); it != vp[i].end(); ++it) {
			cout << it->first << " " << it->second << endl;
		}
	}
}

void DFSUtils(int in, vector<pair<int, int>> vp[], vector<bool> &visited) {
	visited[in] = true;
	cout << in << " ";
	for(int i = 0; i < vp[in].size(); ++i) {
		if(visited[vp[in][i].first] == false) {
			DFSUtils(vp[in][i].first, vp, visited);
		}
	}
}

void DFS(vector<pair<int, int>> vp[], int s) {
	vector<bool> visited(s, false);
	DFSUtils(0, vp, visited);
}

int main() {
	//vector<int> v[5];
	//addNode(v, 0, 1);
	//addNode(v, 0, 4);
	//addNode(v, 1, 3);
	//addNode(v, 1, 2);
	//addNode(v, 1, 4);
	//addNode(v, 2, 3);
	//addNode(v, 2, 4);
	//printNodes(v, 5);
	
	//DFS(v, 5);

	//adjacency matrix...
	//addNode(0, 1);
	//addNode(0, 4);
	//addNode(1, 3);
	//addNode(1, 2);
	//addNode(1, 4);
	//addNode(2, 3);
	//addNode(2, 4);
	//printNodes();
	
	//weighted graph...
	vector<pair<int, int>> vp[5];
	addW(vp, 0, 1, 10);
	addW(vp, 0, 2, 20);
	addW(vp, 0, 3, 30);
	addW(vp, 0, 4, 40);
	addW(vp, 1, 2, 10);
	addW(vp, 1, 3, 20);
	addW(vp, 1, 4, 30);
	addW(vp, 2, 3, 10);
	addW(vp, 2, 4, 20);
	addW(vp, 3, 4, 10);
	//
	//printW(vp, 5);
	DFS(vp, 5);
	return 0;
}
