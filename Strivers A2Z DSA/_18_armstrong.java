import java.util.Scanner;

public class _18_armstrong {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int temp = n;
        int temp1 = n;
        int sum = 0;    

        int count = 0;
        
        while(temp1>0){
            count++;
            temp1 = temp1/10;
        }

        while(n>0){
            int rem = n%10;
            sum = sum + (int)Math.pow(rem, count);
            n = n/10;
        }

        System.out.print("The sum of the cube of the digits of the number is : " + sum + "\n");

        if(sum == temp){
            System.out.println("The number is an Armstrong number.");
        }
        else{
            System.out.println("The number is not an Armstrong number.");
        }
    }
}


