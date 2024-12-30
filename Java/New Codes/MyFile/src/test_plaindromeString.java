public class test_plaindromeString {
    public static void main(String[] args) {
        String S = "abba";
        int a = 0;
        boolean flag = true;
        int b = S.length() - 1;

        while (a <= b) {
            if (S.charAt(a) != S.charAt(b)) {
                flag = false;
                break;
            }
            a++;
            b--;
        }

        if (flag == false) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }
}
