#include<iostream>
using namespace std;

void display(int arr[], int n)
{
  for(int i=0;i<n;i++)
    {
      cout<<arr[i];
    }
}

int main()
{
    int n, arr[100];
    cout<<"Enter the number of elements in array";
    cin>>n;
    cout<<"Enter the values inside array";
    for(int i=0;i<n;i++)
   {
        cin>>arr[n];
   }
    display(arr,n);
    return 0;
}
