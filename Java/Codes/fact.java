import java.util.Scanner;

public class fact {

    static int lisa(int x) {

        if (x == 0 || x == 1) {

            return 1;
        } else {
            int total = 1;
            for (int i = 1; i <= x; i++) {
                total = total * i;

            }
            return total;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Factorial =");
        int a = sc.nextInt();

        System.out.println("The factorail of x is =" + lisa(a));
    }

}