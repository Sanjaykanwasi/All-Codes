import java.util.*;

public class _65_hashmap_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr1[] = new int[n];
        System.out.print("Enter the values: ");
        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        // MAP CREATION
        Map<Integer, Integer> sol = new HashMap<>();
        for(int i=0; i<n; i++){
          //NoT COMPLETED....  
        }

        // Queries
        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();
        while(q<0){
            int num = sc.nextInt();
            System.out.print(sol.get(num));
            q--;
        }

    }
}
