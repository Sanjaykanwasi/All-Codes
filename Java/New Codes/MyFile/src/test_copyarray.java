public class test_copyarray {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 4, 6 };
        int arr2[] = { 7, 6, 5, 2 };
        int arr3[] = { 12, 13, 11, 16 };
        int newarr[] = new int[arr1.length + arr2.length + arr3.length];

        System.arraycopy(arr1, 0, newarr, 0, arr1.length);
        System.arraycopy(arr2, 0, newarr, arr1.length, arr2.length);
        System.arraycopy(arr3, 0, newarr, arr1.length + arr2.length, arr3.length);

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
