import java.util.*;

public class _01_input {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int a = sc.nextInt();

        System.out.print("The number you entered is : ");
        System.out.println(a);
    }
}
