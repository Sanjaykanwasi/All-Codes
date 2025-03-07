import java.util.*;

public class _22_assendingorder {

    public static void checkOrder(int arr[]) {
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = 1;
                System.out.print("The Array is not in Ascending order");
                return;
            }
        }

        if (flag == 0)
            System.out.println("The array is in Acending order");
    }

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.print("Enter the number = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        checkOrder(arr);
    }
}
