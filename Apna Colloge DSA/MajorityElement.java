import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MajorityElement{
    
    public static int majorityElement(int[] nums){
        // Lets creata a freq Map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Now Lets Make A Max priority Queue
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b)-> b.getValue() - a.getValue());
        maxHeap.addAll(freqMap.entrySet());

        // Now Lets Get The Majority Element
        Map.Entry<Integer, Integer> majorityElement = maxHeap.poll();
        return majorityElement.getKey();
    }
    
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(arr));
    }
}