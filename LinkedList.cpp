#include<bits/stdc++.h>
using namespace std;

struct Node {
    int data;
    struct Node *next;
};

class LinkedList {
    private:
        struct Node *head;
    public:
        LinkedList() {
            head = NULL;
        }

        bool isEmpty() {
            return head == NULL;
        }

        int at(int index = 0) {
            if(isEmpty()) {
                throw "Cannot find elements from an empty list.";
                return -1;
            }
            if(index == 0) {
                return head->data;
            }
            struct Node* temp = head;
            for(int i = 0; i < index; ++i) {
                temp = temp->next;
                if(temp == NULL) {
                    throw "Index out of bound.";
                }
            }
            return temp->data;
        }

        int size() {
            Node* temp = head;
            int cnt = 0;
            while(temp != NULL) {
                temp = temp->next;
                cnt++;
            }
            return cnt;
        }

        void clear() {
            head = NULL;
        }

        void push_back(int n) {
            struct Node* toAdd = (struct Node*) malloc(sizeof(struct Node));
            toAdd->data = n;
            toAdd->next = NULL;
            if(isEmpty()) {
                head = toAdd;
                return;
            }
            struct Node* temp = head;
            while(temp->next != NULL) {
                temp = temp->next;
            }
            temp->next = toAdd;
        }

        void push(int n, int index = 0) {
            struct Node* toAdd = (struct Node*) malloc(sizeof(struct Node));
            toAdd->data = n;
            toAdd->next = NULL;
            if(index == 0) {
                toAdd->next = head;
                head = toAdd;
                return;
            }
            struct Node* temp = head;
            for(int i = 1; i < index - 1; ++i) {
                temp = temp->next;
                if(temp == NULL) {
                    throw "Index out of bound.";
                }
            }
            toAdd->next = temp->next;
            temp->next = toAdd;
        }

        void push_front(int n) {
            struct Node* currNode = (struct Node*) malloc(sizeof(struct Node));
            currNode->data = n;
            currNode->next = head;
            head = currNode;
        }

        int pop_back() {
            struct Node* temp = head;

            if(temp == NULL) {
                throw "Cannot remove elements from an empty list.";
                return -1;
            }

            if(temp->next == NULL) {
                struct Node* toRemove = head;
                head = NULL;
                return toRemove->data;
            }
            while(temp->next->next != NULL) {
                temp = temp->next;
            }
            struct Node* toRemove = temp->next;
            temp->next = NULL;
            return toRemove->data;
        }

        int pop(int index) {
            if(isEmpty()) {
                throw "Cannot remove elements from an empty list.";
                return -1;
            }
            if(index == 0) {
                struct Node* toRemove = head;
                head = head->next;
                return toRemove->data;
            }
            struct Node* temp = head;
            struct Node* toRemove = head;
            for(int i = 1; i < index; ++i) {
                toRemove = temp;
                temp = temp->next;
                if(temp == NULL) {
                    throw "Index out of bound.";
                }
            }
            toRemove->next = temp->next;
            return temp->data;
        }

        int pop_front() {
            if(isEmpty()) {
                throw "Cannot remove elements from an empty list.";
                return -1;
            }

            if(head->next == NULL) {
                struct Node* toRemove = head;
                head = NULL;
                return toRemove->data;
            }
            struct Node* toRemove = head;
            head = head->next;
            return toRemove->data;
        }

        void show() {
            cout << "Elements of list are: ";
            Node* temp = head;
            while(temp != NULL) {
                cout << temp->data << " ";
                temp = temp->next;
            }
        }
};

int inputHelper(string what) {
    cout << "\nWhere to " << what << " elements?";
    cout << "\n\t1. At front.\n\t2. At Particular Position.\n\t3. At Back.\nEnter: ";
    int x; // sub operations to perform
    cin >> x;
    return x;
}

template<class A>
void read(A& a, string output = "") {
    cout << output;
	cin >> a;
}

int main() {
    LinkedList ll;
    // op - operation to perform.
    int op = 1, n, i;
    cout << "Welcome to Linked List Implementation Program. Press Ctrl+C anytime to exit the program.";
    while(1) {
        cout << "\n\n------------------------------\nChoose an operation to perform\n";
        cout << "1. Insert elements in list.\n2. Delete elements from list.\n3. See a element at list.\n4. Display the list.\n";
        cout << "5. Size of the list.\n6. Clear the list.\nEnter Your Choice: ";
        cin >> op;
        switch(op) {
            case 1: // insert elements
                read(n, "Enter the element: ");
                switch(inputHelper("insert")) {
                    case 1:
                        ll.push_front(n);
                        break;
                    case 2:
                        read(i, "Enter the index: ");
                        ll.push(n, i - 1); // since the index is started from 0
                        break;
                    case 3:
                        ll.push_back(n);
                        break;
                    default:
                        ll.push_back(n); // default push at the back of the list
                        break;
                }
                break;
            case 2: // delete elements
                switch(inputHelper("delete")) {
                    case 1:
                        cout << "Removed element is: " << ll.pop_front();
                        break;
                    case 2:
                        read(i, "Enter the index: ");
                        cout << "Removed element is: " << ll.pop(i - 1);
                        break;
                    case 3:
                        cout << "Removed element is: " << ll.pop_back();
                        break;
                    default:
                        cout << "Removed element is: " << ll.pop_back(); // default pop the last element
                        break;
                }
                break;
            case 3: // display elements
                switch(inputHelper("display")) {
                    case 1:
                        cout << ll.at(0); // at the first index
                        break;
                    case 2:
                        read(i, "Enter the index: ");
                        cout << ll.at(i - 1);
                        break;
                    case 3:
                        cout << ll.at(ll.size() - 1); // at the last index
                        break;
                    default:
                        cout << ll.at(0); // default at the first index
                        break;
                }
                break;
            case 4: // display the list
                ll.show();
                break;
            case 5: // output size of the list
                cout << "The size of list is: " << ll.size();
                break;
            case 6: // clear the list
                ll.clear();
                break;
            default: // default case show elements
                ll.show();
                break;
        }
    }

    return 0;
}

// test-case input
// 1 5 1
// 1 7 3
// 1 6 2 2
// 1 4 1
// 4
// 2 3
// 5
// 6
// 5
