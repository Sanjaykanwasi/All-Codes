public class recursion_11 {
    
    public static void printpermu(String str, String permu){

        if(str.length()==0){
            System.out.println(permu);
            return;
        }

        for(int i = 0; i<str.length(); i++) {
            char currentchar = str.charAt(i);
            //abc = ac    
            String newString = str.substring(0, i) + str.substring(i+1);
            printpermu(newString, permu + currentchar);

        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printpermu(str, "");
    }
}
 