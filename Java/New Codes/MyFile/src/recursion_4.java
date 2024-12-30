

// using iteration method

//public class recursion_4 {
//  public static void main(String[] args) {
//       String s = "abcd";/
//       for(int i = s.length()-1; i>=0 ; i--){
//       
//        System.out.print(s.charAt(i) + " ");
//        }
//    }  
//}

// Now Lets solve with the help of Recursion

public class recursion_4 {

    public static void printrev(String s, int index) {
        if(index == 0){
            System.out.print(s.charAt(index) + " ");
            return;
        }
        
        System.out.print(s.charAt(index) + " ");
        printrev(s, index - 1);
    }
    public static void main(String[] args) {
        String s = "ABCDEF";
        printrev(s, s.length() - 1);
    }
}