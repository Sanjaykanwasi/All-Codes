import java.util.Scanner;

public class _14function {

    public static int printSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        System.out.print("Enter the numbers = ");
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = printSum(a, b);

        System.out.println(sum);

    }
}
