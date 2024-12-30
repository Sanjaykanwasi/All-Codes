public class Finally {
    public static int run() {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println("Sorry Bitch!!!!!");
        } finally {
            System.out.println("OK I am going out of this....");
        }
        return 0;
    }

    public static int run(int a, int b) {
        while (true) {
            try {
                int c = a / b;
                System.out.println("Division is = " + c);
            } catch (Exception e) {
                System.out.println("B cannot be negative");
                break;
            } finally {
                System.out.println("I am b = " + b);
            }
            b--;
        }
        return 0;
    }

    public static void main(String[] args) {
        // int result = run();
        // System.out.println(result);
        run(10, 5);

    }
}
