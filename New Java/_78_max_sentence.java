import java.util.*;

public class _78_max_sentence {
    public static void main(String[] args) {
       
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);
        String sentences[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int count = 0;

        for(int i=0; i<sentences.length; i++){
           String str = sentences[i];
           String arr[] = str.strip().split(" ");
           
           if(count < arr.length){
                count = arr.length;
           }
          
        }

        System.out.println(count);
    }
}
