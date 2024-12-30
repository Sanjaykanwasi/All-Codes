import java.util.*;

public class _17fibonacci {

    public static void printFibonacci(int num) {
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int num = sc.nextInt();

        printFibonacci(num);

    }
}
