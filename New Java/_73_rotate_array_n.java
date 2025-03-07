import java.util.*;

public class _73_rotate_array_n {
    public static void main(String[] args) {
       @SuppressWarnings("resource")
       Scanner sc = new Scanner(System.in);
       
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        System.out.print("Enter the position: ");
        int k = sc.nextInt();
        k = k % arr.length;

        int temp[] = new int[k];
        
        for(int i =0; i<k; i++){
            temp[i] = arr[i];
        }

        for(int i=k; i<arr.length; i++){
            arr[i-k] = arr[i];
        }

        for(int i=arr.length-(k), j=0; i<arr.length; i++, j++){
            arr[i] = temp[j];
        }

        System.out.println(Arrays.toString(arr));
    }
}
