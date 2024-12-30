import java.util.Scanner;

public class Calculatorin {
    public static void main(String[] args) {

        int a, b, c;
        char operator;

        System.out.println("Enter the First Number =");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Enter the Second Numner =");
        b = s.nextInt();
        System.out.println("What do you want to do =");
        operator = s.next().charAt(0);
        switch (operator) {
            case '+':
                c = a + b;
                System.out.printf("The addition of %d and %d is %d", a, b, c);
                break;

            case '-':
                c = a - b;
                System.out.println(c);
                break;

            default:
                System.out.println("ERror");

        }

    }
}
