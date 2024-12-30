import java.util.Scanner;

public class ashu_cal {
    public static void main(String[] args) {
        System.out.println("Enter 1st number = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter 2nd number = ");
        int b = sc.nextInt();
        System.out.println("Enter what you want to do = ");
        char operator;
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Sum is = " + (a + b));
                break;

            case '-':
                System.out.println("Sum is = " + (a - b));
                break;

            case '*':
                System.out.println("Sum is = " + (a * b));
                break;

            case '/':
                System.out.println("Sum is = " + (a / b));
                break;

            default:
                System.out.println("Error");

        }

    }
}
