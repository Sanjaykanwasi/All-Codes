#include <iostream>
using namespace std;
int main()
{
     int a[5],i,s=0,g,l;
     float avg;
     cout<<"Enter 5 Numbers:\n";
     for(i=0;i<5;i++)
     {
          cin>>a[i];
          s=s+a[i];
          avg=s/5.0;
     }
     cout<<"\nSum of Array Elements = "<<s;
     cout<<"\nAverage of Elements   = "<<avg;
     g=a[0];
     for(i=0;i<5;i++)
          if(a[i]>g)
               g=a[i];
     cout<<"\nGreatest Element      = "<<g;
     l=a[0];
     for(i=0;i<5;i++)
          if(a[i]<l)
               l=a[i];
     cout<<"\nLowest Element        = "<<l;
     return 0;
}