import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer = ");
        int n = sc.nextInt();
        int a = n % 2;

        if (a == 0) {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            }

            else if (n >= 20 && n <= 100) {
                System.out.println("Not Weird");
            }

        }

        else {
            System.out.println("Weird");
        }

    }
}
