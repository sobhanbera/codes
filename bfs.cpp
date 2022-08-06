#include<bits/stdc++.h>

using namespace std;

void addNewEdge(vector<int> root[], int a, int b) {
    root[a].push_back(b);
}

void bfs(int start, vector<int> root[], bool visited[]) {
    cout << "The BFS Traversal: ";
    queue<int> qu;
    qu.push(start);
    visited[start] = true;
    while (!qu.empty()) {
        int f = qu.front();
        cout << f << " ";
        qu.pop();
        for (int i = 0; i < root[f].size(); i++)
            if (!visited[root[f][i]]) {
                qu.push(root[f][i]);
                visited[root[f][i]] = true;
            }
    }
    cout << "\n";
}

void dfs(int start, vector<int> root[], bool visited[]) {
    cout << "The DFS Traversal: ";
    stack<int> st;
    st.push(start);
    visited[start] = true;
    while (!st.empty()) {
        int f = st.top();
        cout << f << " ";
        st.pop();
        for (int i = 0; i < root[f].size(); i++)
            if (!visited[root[f][i]]) {
                st.push(root[f][i]);
                visited[root[f][i]] = true;
            }
    }
    cout << "\n";
}

int main() {
    vector<int> root[100];
    bool visited[100];

    for (int i = 0; i < 100; i++) visited[i] = false;

    // inserting edges into the graph...
    addNewEdge(root, 0, 1);
    addNewEdge(root, 0, 2);
    addNewEdge(root, 1, 3);
    addNewEdge(root, 1, 4);
    addNewEdge(root, 2, 3);
    addNewEdge(root, 3, 4);
    addNewEdge(root, 4, 5);
    addNewEdge(root, 4, 6);
    addNewEdge(root, 6, 7);
    addNewEdge(root, 6, 8);
    addNewEdge(root, 7, 8);

    bfs(0, root, visited);

    for (int i = 0; i < 100; i++) visited[i] = false;

    dfs(0, root, visited);
    return 0;
}
