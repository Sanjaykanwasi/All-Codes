public class _81_remove_space {
    public static void main(String[] args) {
        String str = "sanjay singh kanwasi   hello";
        String  ans = "";
        
        @SuppressWarnings("unused")
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                ans += str.charAt(i); 
            }
        }
        System.out.println(ans);
    }
}
