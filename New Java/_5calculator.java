import java.util.*;

public class _5calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number A and B = ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;

        System.out.println("Enter the operation = ");
        char sign = sc.next().charAt(0);

        switch (sign) {
            case '+':
                answer = a + b;
                System.out.println("Addition is = " + answer);
                break;

            case '-':
                answer = a - b;
                System.out.println("Subtraction is = " + answer);
                break;

            case '*':
                answer = a * b;
                System.out.println("Multiplication is = " + answer);
                break;

            case '/':
                answer = a / b;
                System.out.println("Division is = " + answer);
                break;

            case '%':
                answer = a % b;
                System.out.println("Remainder is = " + answer);
                break;

            default:
                System.out.println("Error");

        }

    }

}
