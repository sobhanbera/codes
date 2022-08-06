#include <iostream>
#include <queue>
using namespace std;

// this is the data needed to control tree data structure.
struct Node {
    int data;
    Node* left;
    Node* right;
};

// this function adds a new node to the binary tree.
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

// this function deletes a node from the binary tree.
struct Node* Delete(struct Node *root, int data) {
	if(root == NULL) return root;
	else if(data < root->data) root->left = Delete(root->left, data);
	else if(data > root->data) root->right = Delete(root->right, data);
	else {
		// now the root may have zero child means its a leaf node.
		// may have one child or two child...
		// lets handle those cases...

		// Case 1: 0 - child(leaf node) of parent node.
		if(root->left == NULL && root->right == NULL) {
			delete root;
			root = NULL;
		}
		// Case 2: 1 - child of parent node.
		else if(root->left == NULL) {
			struct Node *temp = root;
			root = root->right;
			delete temp;
		}else if(root->right == NULL) {
			struct Node *temp = root;
			root = root->left;
			delete temp;
		}
		// Case 3: 2 - child of parent node.
		else {
			struct Node *temp = root->right;
			root->data = temp->data;
			root->right = Delete(root->right, temp->data);
		}
	}
	return root;
}

// this prints elements of binary tree in acsending order...
void InOrder(Node *root) {
	if(root == NULL) return;
	InOrder(root->left);
	cout << root->data << " ";
	InOrder(root->right);
}

int main() {
	Node* root = NULL;
    int x,  n;
    // x - choice and n - sub choice

    cout << "Welcome to Binary tree Implementation. Press Ctrl+C anytime to exit the program.\n";
    while(true) {
        cout << "\n----------------------------------------------\n";
        cout << "1. Insert Element.\n2. Delete Element.\n3. Print the Tree.\nEnter your choice: ";
        cin >> x;
        switch(x) {
            case 1:
                cout << "Enter a number to insert: ";
                cin >> n;
                root = Insert(root, n);
                break;
            case 2:
                cout << "Enter the element to delete: ";
                cin >> n;
                root = Delete(root, n);
                break;
            case 3:
            	InOrder(root);
            	break;
            default:
            	break;
        }
    }
	return 0;
}

