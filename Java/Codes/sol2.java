import java.util.Scanner;

public class sol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println(arr[j]);
        }
    }
}