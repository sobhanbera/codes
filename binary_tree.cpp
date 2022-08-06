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
    int x,  n;
    // x - choice and n - sub choice

    cout << "Welcome to Binary tree Implementation in C++. Press Ctrl+C anytime to exit the program.\n";
    while(true) {
        cout << "\n----------------------------------------------\n";
        cout << "1. Insert Elements\n2. Delete Element.\n3. Get the height of the tree.\n4. Print Tree.\n5. Search elements in tree.\nEnter your choice: ";
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
                cout << "\nHeight of the tree is: " << height(root);
                break;
            case 4:
                cout << "\n1. Level Order Traversal\n2. Pre Order Traversal\n3. Inorder Traversal\n4. Post Order Traversal\nEnter traversal type:";
                cin >> n;
                cout << "\n";
                switch(n) {
                    case 1:
                        LevelOrderTraversal(root);
                        break;
                    case 2:
                        PreOrderTraversal(root);
                        break;
                    case 3:
                        InOrder(root);
                        break;
                    case 4:
                        PostOrder(root);
                        break;
                    default:
                        InOrder(root);
                }
                break;
            case 5:
                cout << "Enter the element to search: ";
                cin >> n;
                if(search(root, n)) cout << n << " is present in the tree.\n";
                else cout << n << " is not present in the tree.\n";
                break;
            default:
                InOrder(root);
        }
    }

	return 0;
}

