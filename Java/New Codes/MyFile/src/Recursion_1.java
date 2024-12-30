public class Recursion_1 {

    public static void printf(int n) {

        int i=1;
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printf(n - 1);
    }

    public static void main(String[] args) {
        int n;
        printf(5);
    }
}
