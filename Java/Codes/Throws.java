public class Throws {

    public static int div(int a, int b) throws ArithmeticException {
        int c = a / b;
        return c;
    }

    public static void main(String[] args) {

        // Throws obj = new Throws();
        try {
            int result = div(6, 0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Error bitch!!!!!!!!!!!!");
        }

    }
}
