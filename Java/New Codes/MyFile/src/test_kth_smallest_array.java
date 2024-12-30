import java.util.Arrays;

public class test_kth_smallest_array {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 20, 15 };

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
