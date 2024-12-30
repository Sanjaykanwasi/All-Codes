import java.util.*;

public class _20searcharray {

    public static int returnNumber(int array[], int x) {

        int rem = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                rem = i;
            }
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number = ");
        int num = sc.nextInt();

        int array[] = new int[num];

        System.out.print("Enter the array = ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched = ");
        int x = sc.nextInt();

        int answer = returnNumber(array, x);

        System.out.println("The index of the number is = " + answer);
    }
}
