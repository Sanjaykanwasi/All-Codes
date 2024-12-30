import java.util.*;

public class _35_merge_sort {

    public static void printmegredarray(int arr[]) {
        System.out.println(Arrays.toString(arr));
    }

    public static void conquer(int arr[], int si, int mid, int ei) {

        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;

        int merged[] = new int[ei - si + 1];

        while (indx1 <= mid && indx2 <= ei) {

            if (arr[indx1] <= arr[indx2]) {
                merged[x] = arr[indx1];
                x++;
                indx1++;
            } else {
                merged[x] = arr[indx2];
                x++;
                indx2++;
            }
        }

        while (indx1 <= mid) {
            merged[x] = arr[indx1];
            x++;
            indx1++;
        }

        while (indx2 <= ei) {
            merged[x] = arr[indx2];
            x++;
            indx2++;
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        conquer(arr, si, mid, ei);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of the array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the Numbers = ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        divide(arr, 0, n - 1);
        printmegredarray(arr);

    }
}
