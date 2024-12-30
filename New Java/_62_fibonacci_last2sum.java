import java.util.*;

public class _62_fibonacci_last2sum {
   
    public static List<Integer> print_fibonacci(int a, int b, int n, List<Integer> sol){

        if(n==0){
            return sol;
        }

        int c = a + b;
        sol.add(c);
       
        return print_fibonacci(b, c, n-1, sol);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        List<Integer> sol = new ArrayList<>();

        int a = 0;
        int b = 1;
        sol.add(a);
        sol.add(b);
     
        System.out.println(print_fibonacci(a, b, n-2, sol));

        int sum = sol.get( n-1) + sol.get(n-2);
        System.out.println(sum);
    }
}
