class A {
    public void meth1() {
        System.out.println("Hello Sanjay");
    }

    public void meth2() {
        System.out.println("Hello SHivam");
    }

}

class B extends A {
    public void meth3() {
        System.out.println("Hello Ashu");
    }

    @Override
    public void meth1() {
        System.out.println("Hello Don");
    }
}

public class overrid {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth2();
        obj.meth1();

    }
}
