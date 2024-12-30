import java.util.Arrays;

public class test_duplicatearray {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 2, 2 };
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
