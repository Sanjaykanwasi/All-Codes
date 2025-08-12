// K sorted Array

import java.util.*;

public class epam3 {
    public static void sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int index = 0;

        // Step 1: Put first k+1 elements into the min-heap
        for (int i = 0; i <= k && i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        // Step 2: For the rest of the elements, add one to heap and remove one
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = minHeap.poll(); // Extract the smallest
            minHeap.add(arr[i]);           // Add new element to heap
        }

        // Step 3: Empty the remaining elements in the heap
        while (!minHeap.isEmpty()) {
            arr[index++] = minHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;

        sortKSortedArray(arr, k);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
