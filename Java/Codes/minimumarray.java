public class minimumarray {
    public static void main(String[] args) {
        
        int [] arr = { 11, -23, 39, 4, 59};
        int min = Integer.MAX_VALUE;

        for( int i = 0 ; i< arr.length; i++) {
            if ( arr[i] < min ) {
                min = arr[i] ;
            }               
           
        }
        System.out.println(min); 
    }

}
