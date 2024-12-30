import java.util.*;

public class _15factorial {

    public static int returnFactorial(int a) {

        int fact = 1;
        if (a == 0 || a == 1) {
            fact = 1;
        } else {
            for (int i = a; i >= 1; i--) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");

        int a = sc.nextInt();

        int factorial = returnFactorial(a);
        System.out.println(factorial);

    }
}
