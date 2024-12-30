import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _57_recursion_2 {
   
    public static int cal_factorail(int ans, int i){ 

        if(i==0){
            return ans;
        }


         ans = ans * i;
        
        return  cal_factorail(ans, i-1);
           
    }

    
    public static void print_factorial(int fact,List<Integer> sol, int n){

        int ans = 1;
        
        for(int i = 0; i<=n; i++){
            fact = cal_factorail(ans, i);
            sol.add(fact);
       }

       System.out.println(sol);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        int fact = 1;
        List<Integer> sol = new ArrayList<>();

        print_factorial(fact, sol, n);
    }
}
