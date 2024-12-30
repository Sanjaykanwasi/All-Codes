public class Recursion_10 {
    public static String container[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};   

    public static void createcombination(String str, int index, String combination){

        if(index==str.length()){
            System.out.println(combination);
            return;
        }

        char currentchar = str.charAt(index);
        String map = container[currentchar - '0'];
       
        for(int i = 0; i<map.length(); i++) {
            createcombination(str, index + 1, combination + map.charAt(i));
        }
    }
    public static void main(String[] args) {
         String str = "23";
         createcombination(str, 0, "");
    }
}
