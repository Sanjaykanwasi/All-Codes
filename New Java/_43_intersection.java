import java.util.*;

public class _43_intersection {
   
   public static void intersection_arr(int arr1[], int arr2[]){

        int i=0;
        int j =0;

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
            if(i >= arr1.length || j >= arr2.length){
                break;
            }


            //comparison
            if(arr1[i] < arr2[j]){
                i++;
            } else if( arr2[j] < arr1[i]){
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
        int arr1[] = {1, 1, 1, 2, 2, 3, 3, 3};
        int arr2[] = {3, 3, 4};

        intersection_arr(arr1, arr2);
    }
}
