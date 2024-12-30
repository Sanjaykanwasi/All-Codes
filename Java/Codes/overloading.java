public class overloading {
    
    static void foo() {
        System.out.println("HIIII");
    }
    
    static void foo(int a) {

        System.out.println("Sanjay");
    }
    
    static void foo (int a, int b ) {

        System.out.println("baby");
    }

    public static void main(String[] args) {
        
        foo();
        foo(5);
        foo(10, 20);
    }
}
