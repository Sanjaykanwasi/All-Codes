class shape {
    public void area(){
        System.out.println("Area of Shape");
    }
}

class triangle extends shape{
    
    public void display() {
        System.out.println("I am triangle");
    }
    public void area(int l, int b){
        System.out.println("Area is" + " " + 1/2*l*b);
    } 
}

class eqitriangle extends triangle {
 {
System.out.println("I am child class");     
 }   
 
}
public class yoinheritance {
    public static void main(String[] args) {
        eqitriangle t1 = new eqitriangle();
        t1.area();
        t1.display();
        t1.area(2, 2);
    }
}
