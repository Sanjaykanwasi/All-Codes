import java.util.Scanner;

public class _3ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A and B = ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is bigger");
        } else {
            System.out.println("B is bigger");
        }
    }
}
