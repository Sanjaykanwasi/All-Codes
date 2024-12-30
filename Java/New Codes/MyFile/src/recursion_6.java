public class recursion_6 {

    public static void checkarr(int arr[], int i, boolean check) {
        if (i == arr.length - 1) {
            if (check == true) {
                System.out.println("Stricklty Sorted");
            }
            return;
        }

        if (arr[i] < arr[i + 1]) {
            check = true;
        } else {
            check = false;
            System.out.println("Not Sorted");
            return;
        }
        checkarr(arr, i + 1, check);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 9 };
        checkarr(arr, 0, false);
    }
}
