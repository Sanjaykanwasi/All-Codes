import java.util.*;

public class array_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int number[] = new int[size];

        for(int i = 0; i<size; i++) {
            number[i] = sc.nextInt();  
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<size; i++){
            max = Math.max(max, number[i]);
            min = Math.min(min, number[i]);
/* 
            if(max<number[i]) {
                max = number[i];
                
            }
            if(number[i] < min) {
                min = number[i];
               
            } */
        }
        System.out.println("Max Number is =" + max);
        System.out.println("Min number  is =" + min);
    }
}
