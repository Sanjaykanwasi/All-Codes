import java.util.*;

public class _52_reverse_integer {
    
    public static int reverse_integer(int n){
        
        int reveresed_num = 0;

        boolean isNegative = false;
        if (n < 0) {
            isNegative = true;
            n = -n;
        }
        //1534236469



        while (n>0) {
            int rem = n%10;
            if (reveresed_num > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            reveresed_num = (reveresed_num*10) + rem;
            n = n/10;
        }
        
        int ans = isNegative ? -reveresed_num : reveresed_num; 

        System.out.println(ans);
        return 0;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        reverse_integer(n);
    }

}
