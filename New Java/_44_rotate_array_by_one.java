import java.util.*;

public class _44_rotate_array_by_one {
    
    public static void rotate_by_one(int arr[]){
        
        int arr2[] = new int[arr.length];
 
        for(int i=0; i<arr.length-1; i++){
            arr2[i+1] = arr[i];
        }

        arr2[0] = arr[arr.length-1];

        
       // System.out.println(Arrays.toString(arr2));
       for(int i=0; i<arr2.length; i++){
        System.out.print(arr2[i] + " ");
    }
    }


    public static void main(String[] args) {
        
        int arr[] = {9, 8, 7, 6, 4, 2, 1, 3};
       
        rotate_by_one(arr);
    }
}
