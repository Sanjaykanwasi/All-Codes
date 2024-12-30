import java.util.*;

public class _45_kadane_algo {
    public static void main(String[] args) {
        int arr[] = {5, 4, -1, 7, 8};
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
                int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum = sum + arr[j];
                if(sum>max){
                    max = sum;
                }
           }           
        }
        System.out.println(max);
    }
}
