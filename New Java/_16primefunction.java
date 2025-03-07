import java.util.*;

public class _16primefunction {

    public static void checkPrime(int a) {

        int m = a / 2;
        int flag = 0;

        if (a == 0 || a == 1) {
            System.out.println("The Nuumber is not Prime");
            return;
        } else {
            for (int i = 2; i <= m; i++) {
                if (a % i == 0) {
                    System.out.println("The Number is not Prime");
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0)
            System.out.println("The Number is Prime");
    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int a = sc.nextInt();

        checkPrime(a);
    }
}
