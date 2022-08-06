#include <iostream>
#include <sstream>
using namespace std;

/*
Enter code for class Student here.
Read statement for specification.
*/

class Student {
private:
    int a, s;
    string f, l;
public:
	Student() {
		a = s = 0;
		f = l = "";
	}

    void sa(int a) {
        this->a = a;
    }
    void ss(int s) {
        this->s = s;
    }
    void sf(string f) {
        this->f = f;
    }
    void sl(string l) {
        this->l = l;
    }
    int ga() {
        return a;
    }
    int gs() {
        return s;
    }
    string gf() {
        return f;
    }
    string gl() {
        return l;
    }
    string to_string() {
        string comma = ",";
        ostringstream oss;
        oss << a;
        ostringstream oss1;
        oss1 << s;
        return oss.str() + comma + f + comma + l + comma + oss1.str();
    }
};

int main() {
    int age, standard;
    string first_name, last_name;
    
    cin >> age >> first_name >> last_name >> standard;
    
    Student st;
    st.sa(age);
    st.ss(standard);
    st.sf(first_name);
    st.sl(last_name);
    
    cout << st.ga() << "\n";
    cout << st.gl() << ", " << st.gf() << "\n";
    cout << st.gs() << "\n";
    cout << "\n";
    cout << st.to_string();
    
    return 0;
}
