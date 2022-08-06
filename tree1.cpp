#include <iostream>
#include <queue>

using namespace std;

//this is the data needed to control tree data structure.
struct Node {
    int data;
    Node* left;
    Node* right;
};

//this function adds a new node to the binary tree.
Node* Insert(Node* root, int data) {
	if(root == NULL) {
		Node* node = new Node();
		node->data = data;
		node->left = node->right = NULL;
		return node;
	}else if(data <= root->data) {
		root->left = Insert(root->left, data);
	}else {
		root->right = Insert(root->right, data);
	}
	return root;
}

//this function deletes a node from the binary tree.
struct Node* Delete(struct Node *root, int data) {
	if(root == NULL) return root;
	else if(data < root->data) root->left = Delete(root->left, data);
	else if(data > root->data) root->right = Delete(root->right, data);
	else {
		//now the root may have zero child means its a leaf node.
		//may have one child or two child...
		//lets handle those cases...

		//Case 1: 0 - child(leaf node) of parent node.
		if(root->left == NULL && root->right == NULL) {
			delete root;
			root = NULL;
		}
		//Case 2: 1 - child of parent node.
		else if(root->left == NULL) {
			struct Node *temp = root;
			root = root->right;
			delete temp;
		}else if(root->right == NULL) {
			struct Node *temp = root;
			root = root->left;
			delete temp;
		}
		//Case 3: 2 - child of parent node.
		else {
			struct Node *temp = root->right;
			root->data = temp->data;
			root->right = Delete(root->right, temp->data);
		}
	}
	return root;
}

//this function return true if data is present in the binary tree else false.
bool search(Node* root, int data) {
	if(root == NULL) return false;
	else if(root->data == data) {
		return true;
	}
	else if(data <= root->data){
		cout << "/ ";
		return search(root->left, data);
	}
	else{
		cout << "\\ ";
		return search(root->right, data);
	}
}

//this function returns the total height of the binary tree.
int height(struct Node *root) {
	if(root == NULL) return -1;
	return max(height(root->left), height(root->right)) + 1;
}

//this function print the tree element in level-order
void LevelOrderTraversal(Node *root) {
	if(root == NULL) return;
	queue<Node*> q;
	q.push(root);
	while(!q.empty()) {
		Node* current = q.front();
		if(current->left != NULL) {
			q.push(current->left);
		}
		if(current->right != NULL) {
			q.push(current->right);
		}
		cout << current->data << " ";
		q.pop();
	}
	cout << endl;
}

//this function print the tree element in pre-order
void PreOrderTraversal(Node *root) {
	if(root == NULL) return;
	cout << root->data << " ";
	PreOrderTraversal(root->left);
	PreOrderTraversal(root->right);
}

//this prints elements of binary tree in acsending order...
void InOrder(Node *root) {
	if(root == NULL) return;
	InOrder(root->left);
	cout << root->data << " ";
	InOrder(root->right);
}

//this function print the tree element in post-order
void PostOrder(Node *root) {
	if(root == NULL) return;
	PostOrder(root->left);
	PostOrder(root->right);
	cout << root->data << " ";
}

int main() {
	Node* root = NULL;

	//some example entries to the binary tree.
	root = Insert(root, 15);
    root = Insert(root, 10);
    root = Insert(root, 20);
    root = Insert(root, 25);
    root = Insert(root, 8);
    root = Insert(root, 12);
	root = Insert(root, 18);
	root = Insert(root, 2);
	root = Insert(root, 9);
	root = Insert(root, 30);
	root = Insert(root, 1);
	root = Insert(root, 0);
	root = Insert(root, 19);
	root = Insert(root, 16);
	root = Insert(root, 17);
	
	//traversal example in binary tree.
	cout << "LevelOrderTraversal : ";
	LevelOrderTraversal(root);
	cout << "PreOrderTraversal : ";
	PreOrderTraversal(root);
	cout << endl;
	cout << "InOrder : ";
	InOrder(root);
	cout << endl;
	cout << "PostOrderTraversal : ";
	PostOrder(root);
	cout << endl;
	return 0;
}
