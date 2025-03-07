import java.util.Scanner;

public class _17_lcm {
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

        int lcm = (a*b)/gcd;
        System.out.println("The LCM of the two numbers is : " + lcm);
    }
}

