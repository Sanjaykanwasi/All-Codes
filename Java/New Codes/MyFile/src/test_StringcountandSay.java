import java.util.*;
public class test_StringcountandSay {
    
    public static String countandsay(int n){
            if(n==1){
                return "1";
            }
            
            StringBuilder ans = new StringBuilder();
            String s = countandsay(n-1);
          //  String ans = "";
            
            int count =0;

            for(int i=0; i<s.length(); i++){
                count++;
                if(i == s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                    ans = ans.append(count).append(s.charAt(i));
                    count =0;
                }
            }
            System.out.println(ans);
            return ans.toString();
            

    }
    public static void main(String[] args) {
       
        countandsay(4);
        
    }
}
