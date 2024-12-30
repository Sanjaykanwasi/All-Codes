import java.util.Scanner;

class pinku extends Exception {
    @Override
    public String getMessage() {
        return "Hello maam";
    }

    @Override
    public String toString() {
        return "hello sir";
    }
}

public class Exception_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number = ");
        int a = sc.nextInt();

        if (a < 10) {
            try {
                throw new pinku();
            } catch (Exception e) {
                System.out.println("Sorry");
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
            }
        }

    }
}