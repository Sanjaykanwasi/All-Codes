import java.util.Scanner;

public class _15_palindrome {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int copy = n;
        int sol = 0;

        while(n>0) {
            int rem = n % 10;
            sol = sol * 10 + rem;
            n = n / 10;
        }
        if(sol == copy){
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
