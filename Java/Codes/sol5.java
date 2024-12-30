
class Arithmetic {
    public int add(int x, int y) {
        int sum;
        sum = x + y;
        return sum;

    }
}

class Adder extends Arithmetic {

}

public class sol5 {
    public static void main(String[] args) {
        Adder obj = new Adder();
        System.out.println("My superclass is: Arithmetic");
        System.out.println(obj.add(10, 32) + " " + obj.add(10, 3) + " " + obj.add(10, 10));

    }
}
