import java.util.*;

public class _21min_max {

    public static void findMinMax(int arr[]) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        /*
         * for (int i = 0; i < arr.length; i++) {
         * if (min > arr[i]) {
         * min = arr[i];
         * }
         * 
         * if (max < arr[i]) {
         * max = arr[i];
         * }
         * }
         */

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println("MAX is = " + max);
        System.out.println("MIN is = " + min);

    }

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("Enter the numbers in the array = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        findMinMax(arr);
    }
}
