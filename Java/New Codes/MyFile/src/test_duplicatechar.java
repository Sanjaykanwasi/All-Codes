import java.util.HashSet;
import java.util.Set;

public class test_duplicatechar {
    public static void main(String[] args) {
        String s = "sanjaya";
        int count =0;

        Set<Character> set= new HashSet<>();  
        for(int i=0; i<s.length(); i++){
            if(!set.add(s.charAt(i))){
                System.out.println(s.charAt(i));
            }
        }
        
    }
}
