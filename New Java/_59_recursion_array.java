import java.util.Arrays;

public class _59_recursion_array {
    
    public static void reverse_arr(int i, int arr[], int j){

        if(i>=j){
            System.out.println(Arrays.toString(arr));
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse_arr(i+1, arr, j-1);
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2};
        int i=0;
        int j = arr.length-1;

        reverse_arr(i, arr, j);
    }
}
