import java.util.*;

public class _74_move_zeros {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};

        int temp[] = new int[arr.length];
        for(int i=0, j=0; i<arr.length; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}
