import java.util.*;

public class _7table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number = ");
        int num = sc.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }

    }
}
