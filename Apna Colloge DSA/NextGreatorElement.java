import java.util.Stack;

public class NextGreatorElement {
    
    public static void nextGreatorElement(int[] nums) {
        int n = nums.length;
        Stack <Integer> s = new Stack<>();
        int[] result = new int[n];

        for(int i = n-1; i>=0; i--){
            while(s.size() > 0 && s.peek() <= nums[i]) {
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = -1; // No greater element found
            }
            else {
                result[i] = s.peek(); // Next greater element
            }
            s.push(nums[i]); // Push current element onto stack
        }
        System.out.print("Next greater elements: ");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }        
    }
    
    public static void main(String[] args) {
        int[] nums = {6, 8, 0, 1, 3};

        nextGreatorElement(nums);
    }
}