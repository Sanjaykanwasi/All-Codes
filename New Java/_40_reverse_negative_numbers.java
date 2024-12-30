import java.util.*;

public class _40_reverse_negative_numbers {
    
    public static void reverse_negative_array(int arr[]){

        int temp;
        for(int i=0; i<9; i++){
            for(int j=0; j<9-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
  
    public static void main(String[] args) {
        
        int arr[] = new int[9];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Elements: ");
        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        reverse_negative_array(arr);

        System.out.println(Arrays.toString(arr));
    }
}
