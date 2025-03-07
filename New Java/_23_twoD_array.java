import java.util.*;

public class _23_twoD_array {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns = ");
        int row = sc.nextInt();
        int columns = sc.nextInt();

        int arr[][] = new int[row][columns];
        System.out.println("Enter the value in 2D array = ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
