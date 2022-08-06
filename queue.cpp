#include<bits/stdc++.h>
using namespace std;
#define MAX_SIZE 1000

struct Queue {
    // the actual queue storage reference
    int qu[MAX_SIZE];
    /*
     * top - the index of the topmost element in the queue
     * back - the index of the last element to be removed
     * size - current size of the queue (this is variable and changes when a element is removed or new elements are added)
     */
    unsigned int top, back, size;
} q;


void init() { // the maximum size of the queue
    q.top = 0;
    q.back = 0;
    q.size = 0;
}

bool isQueueEmpty() {
    return q.size == 0;
}

bool queueIsFull() {
    return q.size == MAX_SIZE;
}

int peek() {
    if (isQueueEmpty()) return -1;
    return q.qu[q.top];
}

int peek_back() {
    if (isQueueEmpty()) return -1;
    return q.qu[q.back];
}

int push(int value) {
    if (queueIsFull()) return -1;
    q.back = (q.back + 1) % MAX_SIZE;
    q.qu[q.back] = value;
    q.size++;
    return 1;
}

int pop() {
    if (isQueueEmpty()) return INT_MIN;
    int val = q.qu[q.top];
    q.top = (q.top + 1) % MAX_SIZE;
    q.size--;
    return val;
}

int main() {
    int con = 1;

    while (con > 0) {
        int ch = 5;
        cout << "Choose a option:\n1. push to queue.\n2. pop element in queue.\n";
        cout << "3. check if the queue is empty.\n4. check if the queue is full.\n";
        cout << "5. get the topmost element.\n-> Enter a choice: ";
        cin >> ch;
        cout << "\n";
        if (ch == 1) {
            int n;
            cout << "-> Enter number of elements do you want to push: ";
            cin >> n;
            cout << "-> Enter " << n << " elements: \n";
            for (int i = 0; i < n; ++i) {
                int x;
                cin >> x;
                if (!push(x)) {
                    cout << "queue is full " << x << " cannot be added.";
                    break;
                }
            }
        } else if (ch == 2) {
            cout << "Enter the number of elements to pop: ";
            int n;
            cin >> n;
            for(int i = 0; i < n; ++i) {
                int popped = pop();
                if (popped != INT_MIN) cout << popped << " is removed from the queue.\n";
                else cout << "the queue is empty.";
            }
        } else if (ch == 3) {
            if (isQueueEmpty()) cout << "yes, the queue is empty.";
            else cout << "no, the queue is not empty.";
        } else if (ch == 4) {
            if (queueIsFull()) cout << "yes, the queue is full.";
            else cout << "no, the queue isn't full";
        } else if (ch == 5)
            cout << "the topmost element is: " << peek();
        else
            cout << "Please input a valid choice.";

        cout << "\nWant to perform operations again(0-no/1-yes/2-ofc)?";
        cin >> con;
    }
    return 0;
}

// NOTE: since the output will be shown in the console, that's why many of the output formats are used to
// provide a good user expreince throughout the UI


