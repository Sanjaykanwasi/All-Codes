class MyExc extends Exception {
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}

public class throw_throws {

    public static double cal(double r) throws MyExc {

        if (r < 0) {
            throw new MyExc();
        }
        double area = Math.PI * r;
        return area;
    }

    public static void main(String[] args) {
        System.out.println("LETS BEGIN");
        try {
            double result = cal(-6);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Sorry Bitch!!!!!!!");
        }

    }
}
