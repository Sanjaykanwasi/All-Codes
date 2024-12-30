class calculator {
    int a = 10;
    protected int b = 5;

    public void cal(int a, int b) {
        int c = a + b;
        System.out.println("Sum is = " + c);
    }
}

class subcal extends calculator {
    public void cal() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class accessmod {
    public static void main(String[] args) {

        subcal obj = new subcal();
        obj.cal(10, 10);
        obj.cal();
    }

}
