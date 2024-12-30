import java.util.*;

public class _70_second_high_low {
    
    public static void second_high_low(int arr[], int n){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int Sec_largest = 0;
        int Sec_smallest = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(largest < arr[i]){
                Sec_largest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > Sec_largest){
                Sec_largest = arr[i];
            }
            
            
            if(smallest > arr[i]){
                Sec_smallest = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest && arr[i] < Sec_smallest){
                Sec_smallest = arr[i];
            }
        }
              
        System.out.println(Sec_largest);
        System.out.println(Sec_smallest);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the values: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        second_high_low(arr,n);

    }
}
