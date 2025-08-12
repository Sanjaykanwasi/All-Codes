import java.util.Scanner;

public class linearysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n]; 

        for(int i = 0; i<n; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();

        for(int i = 0; i<n; i++) {  
            if(arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }   
        }
    }
}