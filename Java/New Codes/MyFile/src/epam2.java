// Find Kth Largest Element

import java.util.Arrays;
import java.util.PriorityQueue;

public class epam2 {
    
    // public static int kthLargetElem(int arr[], int k){
    //     Arrays.sort(arr);
    //     int n = arr.length;
    //     System.out.println(Arrays.toString(arr));
    //     return arr[n-k];
    // }

    public static int kthLargetElem(int arr[], int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int val : arr) {
            minHeap.add(val);

            // Keep heap size to k
            if(minHeap.size() > k){
                minHeap.poll(); // Remove the smallest

            }
        }
         // Top of min-heap is the kth largest
        return minHeap.peek();

    }
    public static void main(String[] args){
        int arr1[] = { 3,2,1,5,6,4};
        int arr2[] = {3,2,3,1,2,4,5,5,6};

        System.out.println(kthLargetElem(arr1, 2));
        System.out.println(kthLargetElem(arr2, 4));
    }
}
