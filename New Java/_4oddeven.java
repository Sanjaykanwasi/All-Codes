import java.util.Scanner;

public class _4oddeven {
    public static void main(String[] args) {
       
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
