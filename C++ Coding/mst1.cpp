#include<iostream>
using namespace std;
class employee{
    string name;
    int age;
    string designation;
    double salary;
    public:
    void getdata(){
        cout<<"Enter the name:";
        cin>>name;
        cout<<"enter age: ";
        cin>>age;
        cout<<"Enter designation :";
        cin>>designation;
        cout<<"enter salary:";
        cin>>salary;
    }
    void display(){
        cout<<"Sanjay UID=20bcs9291\n";
        cout<<"name is : "<<name<<endl;
        cout<<"Age is : "<<age<<endl;
        cout<<"Designation is : "<<designation<<endl;
        cout<<"Salary is : "<<salary<<endl;

    }
};
int main(){
    employee obj1[2];
    for(int i=0;i<2;i++){
        obj1[i].getdata();
    }
    for(int i=0;i<2;i++){
        obj1[i].display();
    }
    return 0;
}