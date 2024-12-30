import java.util.Arrays;

public class test_merge2array {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };

        int arr3[] = new int[9];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        Arrays.sort(arr3);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
