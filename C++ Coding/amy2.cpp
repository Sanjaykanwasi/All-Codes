#include <iostream>

using namespace std;

int main(){

  int a[5] = {2,4,6,8,22};

  int *p = &a[1];

  cout << a[0] << " " 

       << p[-1];

  cout << a[1] << " " 

       << p[0];
 return 0;
} 