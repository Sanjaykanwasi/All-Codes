import java.util.*;

public class _49_nth_fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        List<Integer> sol = new ArrayList<>();

        sol.add(b);

        for(int i=2; i<n+1; i++){
            int c = a+b;
            sol.add(c);
            a = b;
            b = c;
        }
        System.out.println(sol.get(n-1));
    }
}
