import java.util.Scanner;

public class _13_countdigits {
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int copy = n;
        int count = 0;

        while(n>0){
            int rem = n % 10;

            if(rem!=0 && copy%rem==0){
                count++;
            }
            n = n/10;
        }
        System.out.println("Count of digits which divides the number : " + count);
    }
}
