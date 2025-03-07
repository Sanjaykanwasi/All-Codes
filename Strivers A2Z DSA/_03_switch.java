import java.util.*;

public class _03_switch {
    public static void main(String[] args ){

       @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Enter the operation you want to perform : ");

        char operation = sc.next().trim().charAt(0);

        switch(operation){
            case '+':
                System.out.println("The sum of a and b is : "+(a+b));
                break;
            case '-':
                System.out.println("The difference of a and b is : "+(a-b));
                break;
            case '*':
                System.out.println("The product of a and b is : "+(a*b));
                break;
            case '/':
                System.out.println("The division of a and b is : "+(a/b));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
