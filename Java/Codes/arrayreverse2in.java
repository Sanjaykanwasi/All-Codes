import java.util.Scanner;

public class arrayreverse2in {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size = ");
        int n = sc.nextInt();

        int temp;
        int arr[] = new int[n];
        System.out.println("Enter the Values of array = ");
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        int l = arr.length / 2;
        for (int i = 0; i < l; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - 1 - i] = temp;

        }
        System.out.print("Reversed array is = ");
        for (int k = 0; k < n; k++) {

            System.out.print(arr[k] + " ");
        }

    }
}
