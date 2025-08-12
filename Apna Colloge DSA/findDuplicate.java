public class findDuplicate {
    
    public static int findDuplicate(int nums[]){
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the intersection point
        do{
            slow = nums[slow]; // Move slow pointer by 1 step
            fast = nums[nums[fast]]; // Move fast pointer by 2 steps
        }while(slow !=fast);


        // Phase 2: Find the entrance to the cycle
        slow = nums[0]; // Reset slow pointer to the start
        while(slow != fast){
            slow = nums[slow]; // Move slow pointer by 1 step
            fast = nums[fast]; // Move fast pointer by 1 step
        }

        return slow; // The duplicate number is the entrance to the cycle
    }
    
    public static void main(String[] args) {
        int nums[] ={3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
