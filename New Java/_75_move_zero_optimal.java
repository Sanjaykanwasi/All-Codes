import java.util.*;

public class _75_move_zero_optimal {
    public static void main(String[] args) {
        
        int arr[] = {0, 1, 0, 3, 12};

        int j = -1; //points to non zero number
        int temp = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        
        // if(j == -1){
        //     return;
        // }
        
        for(int i = j+1; i<arr.length; i++){
            if(arr[i] != 0){
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
 
        System.out.println(Arrays.toString(arr));
    }
}
