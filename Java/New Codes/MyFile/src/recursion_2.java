public class recursion_2 {
    
   public static void printsum(int i, int n, int sum) {

    if(i==n){
        sum = sum+i;
        System.out.println(sum);
        return;
    }

    sum = sum+i;
    printsum(i +1 , n, sum);
   }
   
    public static void main(String[] args) {
       printsum(1, 10, 0); 
    }
}
