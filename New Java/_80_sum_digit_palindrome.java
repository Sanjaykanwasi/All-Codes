import java.util.*;

public class _80_sum_digit_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        // 56
        int remainder = 0;
       int reversed = 0;
       int original = 0;
       int newNum = 0;

        while(n != 0){
            newNum +=  n % 10;;
            n = n/10;  
        }

        original = newNum;

        while (newNum !=0) {
            remainder = newNum % 10;
            reversed = reversed * 10 + remainder;
            newNum /= 10; 
        }

        System.out.println(original);
        System.out.println(reversed);

        if(reversed == original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}