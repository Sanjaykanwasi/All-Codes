import java.util.Scanner;

public class sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }

    }
}