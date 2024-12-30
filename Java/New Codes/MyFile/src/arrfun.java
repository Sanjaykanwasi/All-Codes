public class arrfun {

    public void insert(int arr[], int index, int element) {
        for (int i = 3; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = element;

    }

    public static void show(int arr[]) {
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main Function
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 5;
        arr[3] = 7;
        arr[4] = 9;

        arrfun obj = new arrfun();
        obj.show(arr);

        obj.insert(arr, 1, 69);
        obj.show(arr);

    }
}
