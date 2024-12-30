abstract class parent2 {

    public void hello() {
        System.out.println("Hello world");
    }

    abstract public void greet();
}

class child2 extends parent2 {
    @Override
    public void greet() {
        System.out.println("Hello Sanjay");
    }
}

public class abstractin {
    public static void main(String[] args) {

        child2 obj = new child2();
        obj.greet();
        obj.hello();

    }
}
