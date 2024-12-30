import java.util.*;

public class _68_high_low_freq {
    
    public static void high_low_freq(int arr[], int n){
        

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        high_low_freq(arr, n);
    }
}
