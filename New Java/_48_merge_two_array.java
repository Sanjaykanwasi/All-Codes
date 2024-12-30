import java.util.*;

public class _48_merge_two_array {
    
    public static void sortArray(int arr2[]){

         // Sorting Array 2
         int temp2=0;
         for(int k=0; k< arr2.length-1; k++){
             if(arr2[k] > arr2[k+1]){
                 temp2 = arr2[k];
                 arr2[k] = arr2[k+1];
                 arr2[k+1] = temp2;
             }
         }
    }
    
    
    public static void merge_arr(int arr1[], int arr2[]){

        int i = 0, j=0, temp =0;
       
        // Swapping
       while(i<arr1.length){
        if(arr1[i] > arr2[j]){
            temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            sortArray(arr2);
           }
        i++;

     }

       System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arr2));
    }
    
    public static void main(String[] args) {
        
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};

        merge_arr(arr1, arr2);

    }
}
