/**
 * Code By: Sobhan Bera
 * Section/Roll No: B-36
 * Timestamp: 1636788723000
 * Language: C++
 * GitHub: https://github.com/sobhanbera
 */
#include <bits/stdc++.h>
using namespace std;

#define STACK_SIZE 1000000 // the maximum size of stack in this program

class Stack {
    int head; // the top most element in the stack
    public:
        int a[STACK_SIZE]; // the stack itself

    Stack() {
        head = -1;
    }

    /**
     * @returns if the stack is empty or not
     */
    bool isStackEmpty() {
        return head < 0;
    }

    /**
     * @param {int} num the element to insert into the stack
     * @returns {bool} true if the stack is not full and the num is inserted successfully else false will be returned
     */
    bool push(int num) {
        if (head >= (STACK_SIZE - 1)) return false;
        else {
            a[++head] = num;
            return true;
        }
    }

    /**
     * @retuns false if the stack is empty else pops a element from stack and returns true
     */
    bool pop() {
        if (head < 0) return false;
        else {
            return true;
            return a[head--];
        }
    }
};

int main() {
    class Stack stack;
	int input = 1, c = 1, val;
	cout << "Welcome To Stack Push/Pop Implementation.\nEnter Ctrl+C anytime to exit the program.\n\n";

	while(input) {
		cout << "1. Push\n2. Pop\nEnter Your choice: ";
		cin >> c;

		if(c == 1) {
            // enter a element into the stack
			cout << "Enter the element: ";
			cin >> val;
            if(stack.push(val)) cout << val << " inserted successfully.\n";
            else cout << "stack size exceded";
		} else if(c == 2) {
            // delete or pop a element from the stack
            if(stack.pop()) cout << "Element successfully poped.\n";
            else cout << "Stack is empty.\n";
		} else {
            // the input is not 1 or 2 so show this output and continue to ask for choice again
			cout << "Invalid Choice!";
			continue;
		}

		cout << "Want to continue(Yes-1, No-0)?: ";
		cin >> input;
	}

    return 0;
}


