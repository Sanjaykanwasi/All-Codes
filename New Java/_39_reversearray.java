import java.util.*;

public class _39_reversearray {
    
    
    static void reversearr(int size, int arr[]){
        for(int i =arr.length-1; i>=0; i--){
           System.out.print(arr[i] + " ");
        }
    }
    
    
    
    static void enterelement(int size, int arr[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size = ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter the Elemets in Array = ");
        enterelement(size, arr);    

        System.out.println(Arrays.toString(arr));
        
       

        reversearr(size, arr);


    }
}
 