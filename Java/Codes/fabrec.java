public class fabrec {
    static int fabb(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fabb(n - 1) + fabb(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("SUM is = " + fabb(7));

    }

}
