public class MajorityElement2 {
    
    public static int majorityElement(int[] nums){
        for(int val : nums){
            int freq = 0;

            for(int num : nums){
                if(num == val){
                    freq++;
                }
            }
            
            if(freq > nums.length / 2){
                return val;
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
          int arr[] = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(arr));
    }
}
