import java.util.Scanner;

public class array_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        boolean check = true;
        int num[] = new int[size];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                check = false;
                break;
            }

        }
        if (check == true) {
            System.out.println("Sorted");
        } else
            System.out.println("Not sorted");
    }
}
