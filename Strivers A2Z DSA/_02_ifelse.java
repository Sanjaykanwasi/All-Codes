import java.util.*;

public class _02_ifelse {
    public static void main(String[] args){

     
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a and b : ");
        int a =sc.nextInt();
        int b =sc.nextInt();

        if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }
    }
}
