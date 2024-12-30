import java.util.ArrayList;

/**
 * test_arraykadenes
 */
public class test_arraykadenes {

    public static void main(String[] args) {
        int arr[] = { 5, 4, -1, 7, 8};
        int n = arr.length;
        int sum = 0;
        ArrayList<Integer> sol = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sum = arr[i];
            sol.add(sum);
            for (int j = i + 1; j < n; j++) {
                sum = sum + arr[j];
                sol.add(sum);
            }
        }

        for (int j = 0; j < sol.size(); j++) {
            System.out.print(sol.get(j) + " ");
        }

    }
}