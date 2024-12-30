public class _76_consecutive_ones {
    
    public static int consecutiveOne(int arr[], int n){

        int count = 0;
        int maxi = 0;
        
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                count++;
            }else{
                count = 0;
            }

            if(count > maxi){
                maxi = count;
            }        
        }
        
        return maxi;
    }

    public static void main(String[] args) {
        
        int arr[] ={0, 1, 1, 0};
        int n = arr.length;

        System.out.println(consecutiveOne(arr, n));
    }
}
