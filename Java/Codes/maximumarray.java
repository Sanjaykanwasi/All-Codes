public class maximumarray {
    public static void main(String[] args) {
        
        int [] arr = { 1, 2, 39, 4, 5};
        int max = Integer.MIN_VALUE;

        for( int i = 0 ; i< arr.length; i++) {
            if ( arr[i] > max ) {
                max = arr[i] ;
            }               
           
        }
        System.out.println(max); 
    }

}
