import java.util.Scanner;

class pen{ 
    String colour;
    String type;
    int length;

    public void len(int x){
        System.out.println("Length of the pen is =" + x);    
    }

   public void display(){
    System.out.println(this.colour);
    System.out.println(this.type);
   }
}

public class penclass{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       pen obj1 = new pen();
       pen obj2 = new pen();

       obj1.len(10);
       obj1.colour = "Blue";
       obj1.type = "Ball";
       obj1.display();

       obj2.colour="Black";
       obj2.type="gel";
       obj2.len(20);
       obj2.display();
    }
}