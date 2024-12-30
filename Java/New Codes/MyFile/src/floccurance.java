public class floccurance {

    public static void findoccurance(String daemon, char element) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < daemon.length() - 1; i++) {
            if (element == daemon.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else {
                    last = i;
                }
            }
        }
        System.out.println("First occurance of element " + element + " " + "is = " + first);
        System.out.println("Last occurance of element " + element + " " + "is = " + last);
    }

    public static void main(String[] args) {
        String daemon = "abaacdaefaah";
        findoccurance(daemon, 'a');
    }
}
