import java.util.*;

public class _8primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number = ");
        int num = sc.nextInt();

        int half = num / 2;

        int flag = 0;

        if (num == 0 || num == 1) {
            System.out.println("Number is not Prime");
            flag = 1;
        } else {
            for (int i = 2; i <= half; i++) {
                if (num % i == 0) {
                    System.out.println("Number is not Prime");
                    flag = 1;
                    break;
                }
            }

        }

        if (flag == 0) {
            System.out.println("Number is Prime");
        }
    }
}