import java.util.Scanner;

public class stocks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int input[] = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }

        int min = input[0];

        for (int i = 0; i < n; i++) {
            min = Math.min(min, input[i]);
        }

        int max = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (input[min] == i) {
                idx = i;
                break;
            }
        }
        for (int i = idx; i < n; i++) {
            max = Math.max(max, input[i]);
        }

        int profit = 0;

        profit = max - min;

        System.out.println(profit);
    }
}
