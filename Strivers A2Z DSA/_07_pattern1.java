import java.util.Scanner;

public class _07_pattern1 {
    public static void main(String[] args){

        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of N : ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the leftover newline

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
