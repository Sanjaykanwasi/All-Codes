import java.util.*;

public class _10_pattern4 {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of N : ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
