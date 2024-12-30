public class Recursion_12 {
    
    public static int countpaths(int i, int j, int n, int m){
       
       if(i==n || j==m){
        return 0;
       }
       
        if(i==n-1 && j == m-1){
        return 1;
       }
       
        // for downwards
        int downwards = countpaths(i+1, j, n, m);

        // for rightwards
        int rightwards = countpaths(i, j+1, n, m);

        return downwards + rightwards;
    } 
    public static void main(String[] args) {
        int n = 3 , m = 3;
        int totalways = countpaths(0, 0, n, m);
        System.out.println(totalways);
    }
}
