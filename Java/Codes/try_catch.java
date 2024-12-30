public class try_catch {
    public static void main(String[] args) {
        int a = 500;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Division is = " + c);
        } catch (Exception e) {
            System.out.println("Sorry we Failed");
            System.out.println(e);
        }

        System.out.println("HAve a nice day");
    }
}
