import java.util.*;

public class _19array {
    public static void main(String[] args) {
       
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects = ");
        int size = sc.nextInt();

        int marks[] = new int[size];

        System.out.print("Enter the marks  = ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(marks));
    }
}
