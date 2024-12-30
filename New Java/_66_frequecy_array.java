import java.util.*;

public class _66_frequecy_array {
   
    public static int count_frequency(int arr[], int n){
        
        int hash[] = new int[10];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }
        
        for(int i=1; i<=n; i++){
            System.out.print(hash[i] + " ");
        }

        return 0;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        count_frequency(arr, n);
    }
}
