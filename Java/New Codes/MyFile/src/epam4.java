import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class epam4 {

    public static List<String> topKFrequent(String[] words, int k) {
        // Step 1: Count Freq 
        HashMap<String, Integer> freqMap = new HashMap<>();
        for(String str : words){
            freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
        }

        // Step 2: Min-heap with custom comparator
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>((a,b) -> {
            if(!a.getValue().equals(b.getValue())){
                return a.getValue() - b.getValue();
            }else{
                return b.getKey().compareTo(a.getKey());
            }
        });

        // Step 3: Add entries to heap and keep size <= k
        for(Map.Entry<String, Integer> enrty : freqMap.entrySet()){
            heap.offer(enrty);

            if(heap.size() > k){
                heap.poll();
            }
        }
    
        // Step 4: Build result list from heap (reverse order)
        ArrayList<String> result = new ArrayList<>();
        while(!heap.isEmpty()){
            result.add(heap.poll().getKey());
        }

         Collections.reverse(result); // because we used min-heap
         return result;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "banana"};
        String[] words2 = {"i","love","leetcode","i","love","coding"};
        int k = 2;

        List<String> topWords = topKFrequent(words2, k);
        System.out.println(topWords); // Output: [banana, apple]

    }
}
