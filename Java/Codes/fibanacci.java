public class fibanacci {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print("The fibanacci Series is =" + n1 + " " + n2);
        for (int i = 2; i <= 10; i++) {

            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;

        }

    }
}
