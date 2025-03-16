import java.util.Scanner;

public class _23_recursion1 {
   
   
    public static void printnames(int n, String name){
        if(n == 0){
            return;
        }

        printnames(n-1, name);
        System.out.print(name + " ");
    }
   
    public static void main(String[] args) {
       
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        printnames(n, name);
    }
}
