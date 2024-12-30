public class test_array_movenegative {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;

        int count = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                a[count] = arr[i];
                count++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                a[count] = arr[j];
                count++;
            }
        }
        System.arraycopy(a, 0, arr, 0, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
