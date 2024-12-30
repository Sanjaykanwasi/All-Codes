import java.util.Arrays;
import java.util.Scanner;

public class test_max_money {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n= ");
        int n = sc.nextInt();

        int ans = 0;
        while (i < n) {
            System.out.println("Enter array size");
            int x = sc.nextInt();
            int arr[] = new int[x];
            System.out.println("Enter the max value =");
            int max = sc.nextInt();

            for (int j = 0; i < x; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            for (int m = 0; i < x; i++) {
                if (ans < max) {
                    ans = ans + arr[m];
                }
            }

        }

        System.out.println(ans);
    }
}
