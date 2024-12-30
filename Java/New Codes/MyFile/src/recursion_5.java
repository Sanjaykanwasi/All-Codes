public class recursion_5 {

    public static int first = -1;
    public static int last = -1;

    public static void printocc(String s, int index, char element) {
        if (index == s.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentchar = s.charAt(index);
        if (currentchar == element) {
            if (first == -1) {
                first = index;
            } else
                last = index;
        }

        printocc(s, index + 1, element);
    }

    public static void main(String[] args) {
        String s = "abaacdaefaah";

        printocc(s, 0, 'a');

    }
}
