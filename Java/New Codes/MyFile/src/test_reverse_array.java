import java.util.*;
public class test_reverse_array {

    public static void reverseArray(int arr[]){
    
        for(int i = 0; i<arr.length/2; i++){ 
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;
            }
        
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the values of Array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);
     }
}

