import java.util.Scanner;

public class _56_recursion_1 {
    
    public static void print_num(int i, int n){

        if(i==n +1){
            return;
        }

        System.out.print(i + " ");
        print_num(++i, n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int i = 1;

        print_num(i,n);
    }
}
