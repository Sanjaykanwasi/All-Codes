public class Recursion_13 {
    
    public static int placetiles(int n, int m){
       
       if(n==m) {
        return 2;
       }

       if(n<m){
        return 1;
       }

        //vertically
        int vertically = placetiles(n-m, m);

        //horizontally
        int horizontally = placetiles(n-1, m);

        return vertically + horizontally; 
    }
    public static void main(String[] args) {
        int n = 4, m = 2;

        int totalways = placetiles(n, m);
        System.out.println(totalways);

    }
}
