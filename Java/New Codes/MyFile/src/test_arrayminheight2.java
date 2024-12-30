import java.util.Arrays;

public class test_arrayminheight2 {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 4, 3, 7, 2, 10, 3, 2, 1 };
        int n = arr.length;
        int k = 5;

        Arrays.sort(arr);

        int diff = arr[n - 1] - arr[0];

        int min, max;

        for (int i = 1; i < n; i++) {

            if (arr[i] - k < 0) {
                continue;
            }

            max = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            min = Math.min(arr[0] + k, arr[i] - k);

            diff = Math.min(diff, max - min);
        }

        System.out.println(diff);

    }

}
