import java.util.HashSet;
import java.util.Set;

public class test_Unionofarray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int b[] = { 1, 2, 3, 6, 6 };

        int m = a.length;
        int n = b.length;

        Set<Integer> sol = new HashSet<>();

        for (int i = 0; i < m; i++) {
            sol.add(a[i]);
        }

        for (int i = 0; i < n; i++) {
            sol.add(b[i]);
        }

        System.out.print(sol);
    }
}
