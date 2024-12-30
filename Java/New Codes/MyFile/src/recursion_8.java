public class recursion_8 {

    public static boolean[] map = new boolean[26];

    public static void removeduplicates(String str, int index, String newstring) {
        if (index == str.length()) {
            System.out.println(newstring);
            return;
        }

        char currentchar = str.charAt(index);
        if (map[currentchar - 'a'] == true) {
        } else {
            newstring = newstring + currentchar;
            map[currentchar - 'a'] = true;
        }
        removeduplicates(str, index + 1, newstring);

    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeduplicates(str, 0, "");
    }
}
