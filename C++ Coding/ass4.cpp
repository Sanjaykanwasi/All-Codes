#include<iostream>

#include<conio.h>



using namespace std;

inline float cube(float x) {

  return (x * x * x);

}



int main() {

  float val1, val2;



  cout << "Enter two values:";

  cin >> val1>>val2;



  cout << "\n\nCube value for val1 is     :" << cube(val1) << endl;

  cout << "\n\nCube value for val2 is     :" << cube(val1) << endl;

  getch();

}