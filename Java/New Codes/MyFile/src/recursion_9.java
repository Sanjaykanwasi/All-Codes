import java.util.HashSet;
import java.util.Scanner;

public class recursion_9 {

    public static void subsequence(String str, int index, String newString, HashSet<String> set) {

        if (index == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currentchar = str.charAt(index);

        subsequence(str, index + 1, newString + currentchar, set);

        subsequence(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        subsequence(str, 0, "", set);
    }
}
