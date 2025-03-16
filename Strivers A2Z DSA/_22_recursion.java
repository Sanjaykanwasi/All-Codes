import java.util.Scanner;
public class _22_recursion {
    
    public static void print1ToN(int n){
        if(n==0){
            return;
        }
        print1ToN(n-1);
        System.out.print(n + " ");
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Function to print 1 to n: ");
        print1ToN(n);
    }
}
