import java.util.HashSet;

public class SingleNumber {
    
    public static int singleNumber(int nums[]){
        int sol = 0;

        for(int val : nums){
            sol ^= val; // XOR operation
        }
        return sol;
    }
    
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};

        System.out.println("Single number in the array: " + singleNumber(nums));

    }
}
