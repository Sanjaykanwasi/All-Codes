import java.util.Scanner;

public class _20_printalldivisor {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                System.out.print(i + " ");
                if(i != n/i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }
}
