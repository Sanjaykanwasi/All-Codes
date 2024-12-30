#include<iostream>

using namespace std;



class shape{

  public:

  void dis(){

    cout<<"This is a shape."<<endl;

  }

};



class polygon :public shape{

public:

void dis(){

  cout<<"Polygon is a shape"<<endl;

}

};



class rectangle{

 public:

 void dis(){

   cout<<"Rectangle is a polygon. "<<endl;

 }  

};

class triangle{

public:

void dis(){

  cout<<"Triangle is a polygon."<<endl;

}

};



class square{

public:

void dis(){

  cout<<"square is a rectangle."<<endl;

}

};



int main ()

{

shape obj1;

polygon obj2;

rectangle obj3;

triangle obj4;

square obj5;

obj1.dis();

obj2.dis();

obj3.dis();

obj4.dis();

obj5.dis();

return 0;

}