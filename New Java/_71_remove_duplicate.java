import java.util.*;

public class _71_remove_duplicate {
   
    public static void remove_duplicate(int arr[], int n){

         int i = 0;     
        for(int j = 1; j<n; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Values: ");
        for(int i=0; i<n; i++){
            arr[0] =  sc.nextInt();
        }

        remove_duplicate(arr, n);
    }
}
