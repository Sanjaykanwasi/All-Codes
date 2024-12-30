import java.util.*;

public class _61_sentence_palindrome {
    
    public static boolean check_sentence(int i, String str, int j){
        if(i>=j){
            return true;
        }

        if(str.charAt(i) != str.charAt(j)){
            return false;
        }

        return check_sentence(i+1, str, j-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String str = sc.nextLine();
        
        str =  str.toLowerCase();
        str = str.replaceAll("\\s", "");
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);

        int i = 0;
        int j = str.length()-1;
        System.out.println(check_sentence(i, str, j));
    }
}
