public class selectionsort_1 {
  
  public static void print(int arr[]){
    for(int i =0; i<arr.length; i++)
    System.out.print(arr[i] + " ");
  } 
    public static void main(String[] args) {
        int arr[] = { 9, 2, 6, 1, 5, 8};

        for(int i =0; i<arr.length-1; i++) {
            int smallest = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }        
            }
            int temp = arr[smallest];
                    arr[smallest] = arr[i];
                    arr[i] = temp;
        }
        print(arr);
   } 
}
