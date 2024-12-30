import java.util.Arrays;

public class _58_reverse_array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2};

        for(int i=0, j = arr.length-1; i<arr.length/2; i++, j--){   
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
        }

        System.out.println(Arrays.toString(arr));
    }
}
