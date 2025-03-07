import java.util.*;

public class _04_array {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline

        String[] names = new String[n];

        System.out.print("Enter the names of the students : ");
        for(int i=0; i<n; i++){
            names[i] = sc.nextLine();
        }

        System.out.print("The names of the students are : ");
        System.out.print(Arrays.toString(names));
    }
}
