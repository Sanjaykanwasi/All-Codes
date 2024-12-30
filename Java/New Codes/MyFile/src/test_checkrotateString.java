public class test_checkrotateString {
    public static void main(String[] args) {
        String s = "ababc";
        String c = "cbaba";
        boolean flag = true;

        int apointer = 0;
        int bpointer = c.length() - 1;

        if (s.length() == c.length()) {
            while (apointer <= bpointer) {
                if (s.charAt(apointer) != c.charAt(bpointer)) {
                    flag = false;
                    break;
                }
                apointer++;
                bpointer--;
            }
        } else {
            flag = false;
        }

        if (flag == false) {
            System.out.println("String c is not the rotation of String s");
        } else {
            System.out.println("String c is the rotation of string s");
        }
    }
}
