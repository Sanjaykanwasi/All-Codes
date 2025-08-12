// Return the k smallest elements in the array.

import java.util.ArrayList;
import java.util.PriorityQueue;

public class epam1 {
    
    public static ArrayList<Integer> kthSmallestElem(int arr[], int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> solList = new ArrayList<>();

        for(int i : arr) {
            minHeap.add(i);
        }


        for(int i =0; i < k; i++){
            solList.add(minHeap.poll());
        }

        return solList;
    }
    
    public static void main(String[] args) {
       int nums1[] =  {7, 10, 4, 3, 20, 15};

       int nums2[] = {1, 23, 12, 9, 30, 2, 50};

       System.out.println(kthSmallestElem(nums1, 3));
       System.out.println(kthSmallestElem(nums2, 4));
    }
}
