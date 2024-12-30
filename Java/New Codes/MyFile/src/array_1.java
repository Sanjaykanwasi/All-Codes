import java.util.Arrays;
import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        String student[] = new String[size];

        for (int i = 0; i < size; i++) {
            student[i] = sc.next();
        }

        // for(int i = 0; i<size; i++) {
        // System.out.println(student[i]);
        // }
        System.out.println(Arrays.toString(student));
    }
}
