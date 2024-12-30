import java.util.ArrayList;

public class test_intersectionarray {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 3, 4, 5, 6, 7 };

        ArrayList<Integer> sol = new ArrayList<>();

        int left = 0;
        int right = 0;

        while (left < a.length && right < b.length) {
            // Skip same Numbers
            while (left > 0 && left < a.length && a[left] == a[left - 1]) {
                left++;
            }

            while (right > 0 && right < b.length && b[right] == b[right - 1]) {
                right++;
            }

            // Comparing and adding
            if (a[left] < b[right]) {
                left++;
            } else if (a[left] > b[right]) {
                right++;
            } else {
                sol.add(a[left]);
                left++;
                right++;
            }
        }

        System.out.println(sol.size());
    }

}