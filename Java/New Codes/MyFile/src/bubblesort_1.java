public class bubblesort_1 {

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Main function
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = { 5, 7, 9, 1, 6, 2 };

        // Sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);

    }
}
/*
 * 5,7,1,6,2,9
 * 
 */