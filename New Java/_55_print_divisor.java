import java.util.*;

public class _55_print_divisor {
    
    public static void print_divisor(int n){

        List<Integer> sol = new ArrayList<>();

        for(int i=1; i<=Math.sqrt(n); i++){
            
            if(n%i==0){
                sol.add(i);
            }

            if(n/i != i){
                sol.add(n/i);
            }

        }

        Collections.sort(sol);

        System.out.println(sol);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        print_divisor(n);
    }
}
