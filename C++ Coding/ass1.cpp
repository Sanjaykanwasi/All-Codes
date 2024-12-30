#include <iostream>

#include<conio.h>

using namespace std;

class StudentClass {

private:

char name[20];

int regNo, sub1, sub2, sub3;

float total, avg;

public:

void read() {

cout << "Enter Name :";

cin >> name;

cout << "Enter Registration Number :";

cin >> regNo;

cout << "Enter Marks for Subject 1,2 and 3 :";

cin >> sub1 >> sub2>> sub3;

}

void sum() {

total = sub1 + sub2 + sub3;

avg = total / 3;

}

void print() {

cout << "Name :" << name << endl;

cout << "Registration Number :" << regNo << endl;

cout << "Marks :" << sub1 << " , " << sub2 << " , " << sub3 << endl;

cout << "Total :" << total << endl;

cout << "Average :" << avg << endl;

}

};

int main() {

StudentClass stu1, stu2;

cout << "Read and Print Student Information Class Example Program In C++\n";

cout << "\nStudentClass : Student 1" << endl;

stu1.read();

stu1.sum();

stu1.print();

cout << "\nStudentClass : Student 2" << endl;

stu2.read();

stu2.sum();

stu2.print();

getch();

return 0;

}