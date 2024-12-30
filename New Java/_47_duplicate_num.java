import java.util.*;

public class _47_duplicate_num {
    
    public static void duplicate_number(int arr[], int n){

        //  [1,3,4,2,2]   [3,1,3,4,2]  [3,3,3,3,3] 
        
        int dup = -1;

        for(int i= 0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    dup = arr[i];
                }
            }
        }
        System.out.println(dup);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the Elements: ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        duplicate_number(arr, n);
    }
}
