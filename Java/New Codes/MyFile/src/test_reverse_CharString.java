import java.util.Arrays;

public class test_reverse_CharString {
    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };

        int a = 0;
        int b = s.length - 1;

        while (a <= b) {
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
        System.out.println(Arrays.toString(s));
    }
}
