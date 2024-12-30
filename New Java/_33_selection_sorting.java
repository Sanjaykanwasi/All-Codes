import java.util.Arrays;
import java.util.Scanner;

public class _33_selection_sorting {
    public static void sortselection(int arr[]) {

        int temp = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {

                    smallest = j;
                }
            }

            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
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

        sortselection(arr);
    }
}
