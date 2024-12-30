import java.util.*;

public class _46_minimize_the_height {
    
    public static void maximum_height(int arr[], int n, int k){

           int max, min;
           
           int diff = arr[n-1] - arr[0];

           Arrays.sort(arr);

           for(int i=1; i<n; i++){

                if(arr[i] - k < 0){
                    continue;
                }

                max = Math.max(arr[i-1] + k ,arr[n-1]-k);
                min = Math.min(arr[i] -k ,arr[0]+k);

                diff = Math.min(diff, max - min);
           }

           System.out.println(diff);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter the Value of K: ");
        int k = sc.nextInt();

        System.out.print("Enter the Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maximum_height(arr, n, k);
    }
}
