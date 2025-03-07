public class _77_single_num {
   
    public static int single_num(int arr[]){
      
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        
        return -1;
    }
   
    public static void main(String[] args) {
        int arr[] ={4, 1, 2, 1, 2};

        int ans = single_num(arr);
        
        System.out.println(ans);
    }
}
