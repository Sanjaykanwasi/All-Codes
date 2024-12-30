public class binarysearch {
    
    
    static int binarySearch(int arr[], int low, int high, int target){
        while(low<=high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                System.out.println(mid);
                return mid;
            }
            else if(target> arr[mid]) {
                low = mid +1;
            }
            else {
                high = mid -1;
            }      
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 9, 32, 56, 45};
        int target = 2;
        int low = 0;
        int high = arr.length-1;
        binarySearch(arr, low, high, target);
        
    }
}
