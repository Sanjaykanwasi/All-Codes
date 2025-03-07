import java.util.Scanner;

public class _16_gcd {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        int c = Math.max(a, b);

        int gcd = 1;

        for(int i=1; i<=c; i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }

        System.out.println("The GCD of the two numbers is : " + gcd);
    }
}
