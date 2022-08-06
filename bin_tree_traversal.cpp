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

//this prints elements of binary tree in acsending order...
void InOrder(Node *root) {
	if(root == NULL) return;
	InOrder(root->left);
	cout << root->data << " ";
	InOrder(root->right);
}

//this function print the tree element in pre-order
void PreOrderTraversal(Node *root) {
	if(root == NULL) return;
	cout << root->data << " ";
	PreOrderTraversal(root->left);
	PreOrderTraversal(root->right);
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
    int x,  n;

    cout << "Welcome to Binary tree Implementation in C++. Press Ctrl+C anytime to exit the program.\n";
    while(true) {
        cout << "\n----------------------------------------------\n";
        cout << "1. Insert Element\n2. Print Tree\nEnter your choice: ";
        cin >> x;
        switch(x) {
            case 1:
                cout << "Enter a number to insert: ";
                cin >> n;
                root = Insert(root, n);
                break;
            case 2:
                cout << "\n1. Inorder Traversal\n2. Pre Order Traversal\n3. Post Order Traversal\nEnter traversal type:";
                cin >> n;
                cout << "\n";
                switch(n) {
                    case 1:
                        InOrder(root);
                        break;
                    case 2:
                        PreOrderTraversal(root);
                        break;
                    case 3:
                        PostOrder(root);
                        break;
                    default:
                        InOrder(root);
                }
                break;
            default:
                InOrder(root);
        }
    }
	return 0;
}

