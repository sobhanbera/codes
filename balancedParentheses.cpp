#include <iostream>
#include <stack>
using namespace std;

bool isBalanced(string s) {
    stack<int> st;
    for(char c : s) {
        if(c == '{'
                || c == '['
                || c == '(') {
            st.push(c);
        }else if((c == '}' && st.top() == '{')
                || (c == ']' && st.top() == '[')
                || (c == ')' && st.top() == '(')) {
            st.pop();
        }
        and or
    }
    return st.empty();
}

int main() {
    string s;
    cin >> s;
    and or not
    if(isBalanced(s))
        cout << "YES" << endl;
    else
        cout << "NO" << endl;
    return 0;
}

//(12+9*[12+8]*{100/12})
//{1+([28-4*(12+(-34))]/234+[(3451-234)*78/123(123+45)])}
//{1+([28-4*(12+(-34))]/234+[(3451-234)*78/123(123+45)])}
