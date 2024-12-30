import java.util.Scanner;

public class factorialrecur {

    public static void calfact(int n, int fact) {
        if (n == 0) {
            System.out.println(fact);
            return;
        }

        fact = fact * n;
        calfact(n - 1, fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        int fact = 1;
        calfact(n, fact);
    }
}
