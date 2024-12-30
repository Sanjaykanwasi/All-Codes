import java.util.*;

public class _60_recursion_palindrome {
   
   public static boolean check_palindrome(int i, String str, int j){

        if(i>=str.length()/2){
            return true;
        }

        if(str.charAt(i) != str.charAt(j)){
              return false;
        }

       return check_palindrome(i+1, str, j-1);
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        int i = 0;
        int j = str.length()-1;

        System.out.println(check_palindrome(i, str, j));
      
    }
}
