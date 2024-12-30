import java.util.*;

public class _42_union_of_array {
    
    public static void print_union(int arr1[], int arr2[]){

        //Two Pointers
        int i=0;
        int j =0;

        //List to store Unions
        List<Integer> sol2 = new ArrayList<>();

        while(i < arr1.length || j < arr2.length){

            // same number
            while(i > 0 && i < arr1.length && arr1[i] == arr1[i-1]){
                i++;
            }

            while(j > 0 && j < arr2.length && arr2[j] == arr2[j-1]){
                j++;
            }

            //array finished
            if(i >= arr1.length){
                sol2.add(arr2[j]);
                j++;
                continue;
            }

            if(j >= arr2.length){
                sol2.add(arr1[i]);
                i++;
                continue;
            }

            //comparison
            if(arr1[i] < arr2[j]){
                sol2.add(arr1[i]);
                i++;
            } else if(arr2[j] <arr1[i]){
                sol2.add(arr2[j]);
                j++;
            } else{
                sol2.add(arr1[i]);
                i++;
                j++;
            }

        }
        System.out.println(sol2);

    }
    
    public static void main(String[] args) {
        
        int arr1[] = {1, 1, 1, 2, 2, 3, 3};
        int arr2[] = {3, 3, 3, 4, 4};

        print_union(arr1, arr2);
        
    }
}
