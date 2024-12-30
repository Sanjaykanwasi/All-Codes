public class samethod {

    int calculator(int x, int y) {

        int z;
        z = x + y;

        return z;

    }

    public static void main(String[] args) {

        int a = 10;
        int b = 45;
        int c;

        samethod obj = new samethod();
        System.out.println(obj.calculator(a, b));
        // c = obj.calculator(a, b) ;
        // System.out.println(c);
    }
}
