import java.util.*;

public class _24_search_2D {

    public static void searchIndex(int matrix[][], int x, int row, int columns) {

        int flag = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == x) {
                    System.out.println(i + "," + j);
                    flag = 1;
                    break;
                }

            }
        }
        if (flag == 0)
            System.out.println("Not Found");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns = ");
        int row = sc.nextInt();
        int columns = sc.nextInt();

        int matrix[][] = new int[row][columns];

        System.out.println("enter the value in 2D array = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to be searched = ");
        int x = sc.nextInt();
        System.out.println();
        searchIndex(matrix, x, row, columns);
    }
}
