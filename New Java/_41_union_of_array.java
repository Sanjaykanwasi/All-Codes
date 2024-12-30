import java.util.*;

public class _41_union_of_array {
   
    public static int union(int arr1[], int arr2[], int count){

        Set<Integer> sol = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            sol.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++){
            sol.add(arr2[j]);
        }

        count = sol.size();
        System.out.println(sol);

        return count;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3};
        int count=0;

        System.out.println(union(arr1, arr2, count));

    }
}
