import java.util.*;

public class _26_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = "Tony";
        String two = "Tony";

        if (one.compareTo(two) == 0) {
            System.out.println("Equal Strings");
        } else {
            System.out.println("Not Equal");
        }

        // Substring

        String name = "Sanjay Singh Kanwai";

        String lastname = name.substring(13, name.length());
        System.out.println(lastname);
    }
}
