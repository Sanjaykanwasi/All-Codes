import java.util.Scanner;

public class _19_sumdivisor {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");    
        int n = sc.nextInt();
        int sum = 0;


        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                sum = sum + i;
                if(i != n/i){
                    sum = sum + n/i;
                }
            }
        }
        System.out.println(sum);
    }
}
