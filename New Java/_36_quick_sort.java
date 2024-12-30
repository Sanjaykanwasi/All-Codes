import java.util.Arrays;

public class _36_quick_sort {
    
   public static int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //space for pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
   }
   
    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivotIndx = partition(arr, low, high);

            quickSort(arr, low, pivotIndx-1);
            quickSort(arr, pivotIndx+1, high);            
        }
    }
    
    public static void main(String[] args) {

        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quickSort(arr, 0, n-1);


        System.out.println(Arrays.toString(arr));
    }
}
