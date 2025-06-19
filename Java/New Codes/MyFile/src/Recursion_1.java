public class Recursion_1 {

    public static void printf(int n) {

        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printf(n - 1);
    }

    public static void main(String[] args) {
        printf(5);
    }
}
