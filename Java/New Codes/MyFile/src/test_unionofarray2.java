import java.util.ArrayList;
import java.util.List;

public class test_unionofarray2 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 1, 2, 3, 4, 7, 9 };

        int left = 0;
        int right = 0;
        List<Integer> sol = new ArrayList<>();

        while (left < a.length || right < b.length) {

            // Same element check
            while (left > 0 && left < a.length && a[left] == a[left - 1]) {
                left++;
            }

            while (right > 0 && right < b.length && b[right] == b[right - 1]) {
                right++;
            }

            // If one array is finished

            if (left >= a.length) {
                sol.add(b[right]);
                right++;
                continue;
            }

            if (right >= b.length) {
                sol.add(a[left]);
                left++;
                continue;
            }

            // Comparing and adding in list
            if (a[left] < b[right]) {
                sol.add(a[left]);
                left++;
            } else if (a[left] > b[right]) {
                sol.add(b[right]);
                right++;
            } else if (a[left] == b[right]) {
                sol.add(a[left]);
                left++;
                right++;
            }
        }

        System.out.println(sol);
    }
}
