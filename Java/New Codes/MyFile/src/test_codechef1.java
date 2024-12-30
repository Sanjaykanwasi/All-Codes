import java.util.Scanner;

public class test_codechef1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int count = 0;
        while (t-- > 0) {

            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                if (a <= x && a % y == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}