#include<iostream>
using namespace std;
int main()
{
    int sub,i;
    float total=0,average,marks;

    cout<<"Enter the Number of sujects \n";
    cin>>sub;
    cout<<"enter the marks \n";
    for(i=0;i<sub;i++)
    {
        cin>>marks;
        total+=marks;
    }
    
    cout<<"total marks are ="<<total<<endl;
    cout<<"average marks are ="<<total/sub;
    return 0;
}