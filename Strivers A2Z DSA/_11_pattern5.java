import java.util.Scanner;

public class _11_pattern5 {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of N : ");
        int n = sc.nextInt();

         for(int i=1; i<=n; i++){
            for(int j = i; j<=n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
