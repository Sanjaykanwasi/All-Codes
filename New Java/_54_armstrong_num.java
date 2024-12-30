import java.util.Scanner;

public class _54_armstrong_num {
    
    public static void num_armstrong(int x){

        int copy = x;
        int sum = 0;

        while(x>0){
            int rem = x%10;
            sum = sum + (rem*rem*rem);
            x/=10;
        }

        if(sum == copy){
            System.out.println("True");
       } else{
            System.out.println("False");
       }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();

        num_armstrong(x);
    }
}

