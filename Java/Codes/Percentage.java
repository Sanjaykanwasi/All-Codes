
import java.util.Scanner;

public class Percentage {
    public static void main(String [] args) {

        int eng;
        int hindi;
        int maths;
        int total;
    System.out.println("ENter the marks of english");
    
    Scanner input= new Scanner(System.in);
     eng= input.nextInt();
     System.out.println("ENter the marks of hindi");
     hindi= input.nextInt();
     System.out.println("ENter the marks of maths");
     maths= input.nextInt();
    
     total= (eng+maths+hindi)/3;
     System.out.println("Total percentage is " + total  );
    // System.out.println(total);

    }
    
}
