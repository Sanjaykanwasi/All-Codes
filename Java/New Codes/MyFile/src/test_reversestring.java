import java.util.*;
public class test_reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sol="";

        for(int i = str.length()-1; i>=0; i--){
         //   System.out.print(str.charAt(i));
                sol = sol + str.charAt(i); 
        }
        System.out.print(sol);
    }
}
