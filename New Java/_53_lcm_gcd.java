import java.util.*;

public class _53_lcm_gcd {
    
    public static void lcmAndgcd(int a, int b, List<Integer> sol){

        int gcd = 1;
        
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i ==0){
                gcd = i;
            }
      }
        sol.add(gcd);

        int lcm = (a*b)/gcd;

        sol.add(lcm);

        System.out.println(sol);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> sol = new ArrayList<>();

        lcmAndgcd(a, b, sol);
    }
}
