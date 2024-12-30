import java.util.*;

public class _31_reverse_stringbuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StringBuilder str = new StringBuilder("Sanjay");

        int index = str.length();

        for (int i = 0; i < index / 2; i++) {

            int front = i;
            int back = index - i - 1;

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);
        }
        System.out.println(str);
    }
}
