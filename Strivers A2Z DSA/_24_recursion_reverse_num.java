import java.util.Scanner;

public class _24_recursion_reverse_num {
   
   public static void reverse_num(int n){
    if(n==0){
        return;
    }

    System.out.print(n + " ");
    reverse_num(n-1);

   }
   
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.nextLine();

        reverse_num(n);
    }
}
