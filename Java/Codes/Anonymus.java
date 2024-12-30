interface ashu {
    public void run();

    public void wake();
}

public class Anonymus {
    public static void main(String[] args) {

        ashu obj = new ashu() {
            @Override
            public void run() {
                System.out.println("Ashu run");
            }

            @Override
            public void wake() {
                System.out.println("wake up ashu");
            }
        };
        obj.run();
        obj.wake();
    }
}

// Anonymus class allows us to use the methods of an interface direclty in a
// main method without creating a new class.