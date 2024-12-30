public class test_arrayminjumps {
    public static void main(String[] args) {
        int arr[]= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;

        int count=0;
        int k=0;

        for(int i=0; i<arr.length; i = i+k){
            k = arr[i];
            count++;
        }
        System.out.println(count);
    }
}
