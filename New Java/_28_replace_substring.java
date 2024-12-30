import java.util.*;

public class _28_replace_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string = ");
        String old = sc.nextLine();
        String original = "";

        for (int i = 0; i < old.length(); i++) {
            if (old.charAt(i) == 'e') {
                original += 'i';
            } else {
                original += old.charAt(i);
            }
        }
        System.out.println(original);
    }
}
