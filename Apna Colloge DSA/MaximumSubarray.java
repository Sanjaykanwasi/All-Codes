import java.util.Scanner;

public class MaximumSubarray {
    
    public static int maxSubArray(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0) {
                currentSum = 0; // Reset current sum if it drops below zero
            }
        }

        return maxSum;
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int maxSum = maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
