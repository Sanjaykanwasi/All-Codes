import java.util.*;

public class _18_gcd_funcion {

    public static int returnGcd(int a, int b) {

        int ans = 1;
        int max = Math.max(a, b);

        for (int i = 1; i < max; i++) {
            if (a % i == 0 && b % i == 0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Numbers = ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = returnGcd(a, b);
        System.out.println(gcd);
    }
}
