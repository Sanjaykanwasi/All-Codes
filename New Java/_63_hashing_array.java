import java.util.*;

public class _63_hashing_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int x = sc.nextInt();
        int arr1[] = new int[x];

        System.out.print("Enter the values: ");
        for(int i=0; i<x; i++){
            arr1[i] = sc.nextInt();
        }

        //New Hash Array
        int hash[] = new int[13];

        for(int i=0; i<x; i++){
            hash[arr1[i]] +=1;
        }

        // Running Queries
        System.out.print("Enter the number of quereis: ");
        int q = sc.nextInt();

        while(q>0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
            q--;
        }
    }
}
