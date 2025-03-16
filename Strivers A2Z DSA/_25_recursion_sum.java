import java.util.Scanner;

public class _25_recursion_sum {
    
    public static void print_sum(int n, int sum){
        if(n==0){
          return;
        }

        if(n==1){
            System.out.println(sum);
        }

        print_sum(n-1, sum); 
        sum = sum + n;
      
    }
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.nextLine();
        int sum = 0;

    }   
}
