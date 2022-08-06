#include <iostream>
#include <vector>
using namespace std;

struct tree {
	int data;
	tree* left;
	tree* right;
	tree* mid;
};

void add(tree* root, int data) {
	if(root == NULL) {
		root->data = data;
		return;
	}
	if(data < root->data) {
		add(root->left, data);
	}else if(data == root->data) {
		add(root->mid, data);
	}else {
		add(root->right, data);
	}
}

void add(tree* root, vector<int> data) {
	for(int i : data) {
		add(root, i);
	}
}

void inorder(tree* root) {
	if(root == NULL) {
		return;
	}
	inorder(root->left);
	inorder(root->mid);
	cout << root->data << ' ';
	inorder(root->right);
}

int main() {
	tree* g = NULL;
	vector<int> data = {30, 40, 50, 60, 20, 10, 5, 1, 2, 3, 4, 15, 25, 55, 45};
	add(g, data);
	inorder(g);
}
