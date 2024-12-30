import java.util.*;
public class test_reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        //Inserting
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        //Swapping or Sorting
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            } 
         }
         //Printing
         for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
         }
     }
}

