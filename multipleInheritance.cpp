#include <iostream>
using namespace std;

class student_marks{
    protected:
     int rollNo, marks1, marks2;
    public:
     void get(){
         cout << "Enter yout Roll No. :";
         cin >> rollNo;
         cout << "\nEnter the two Highest Marks :";
         cin >> marks1 >> marks2;
     }
};

class cocurricular_marks{
    protected:
     int comarks;
    public:
     void getsm(){
         cout << "Enter marks for CoCurricular Activities :";
         cin >> comarks;
     }
};

class Result: public student_marks , public cocurricular_marks {
    int total_marks, avg_marks;
    public:
     void display()
     {
         total_marks = (marks1 + marks2 + comarks);
         avg_marks = total_marks/3;
         cout << "\nRoll No. :" << rollNo << "\nTotal Marks :" << total_marks;
         cout << "\nAverage marks :" << avg_marks;
     }
};

int main()
{
    Result res;
    res.get();
    res.getsm();
    res.display();
}
