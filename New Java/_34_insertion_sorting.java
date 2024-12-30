import java.util.Arrays;
import java.util.Scanner;

public class _34_insertion_sorting {

    public static void sortinserrtion(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array = ");
        int n = sc.nextInt();

        System.out.print("Enter the Elements in array = ");
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sortinserrtion(arr);
    }
}
