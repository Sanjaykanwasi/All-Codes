import java.util.Scanner;

public class _14_reverseinteger {
    public static void main(String args[]){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean isNegative = false;

        if(n<0){
            isNegative = true;
            n = -n;
        }

        int sol = 0;

        while(n>0){
            int rem = n%10;
            if (sol > (Integer.MAX_VALUE - rem) / 10) {
                break;
            }
            sol = sol*10 + rem;
            n = n/10;
        }

        int finalanswer = isNegative ? -sol : sol;

        System.out.println("Reverse of the number is : " + finalanswer);
    }
}
