class sandeep extends Thread {
    public sandeep(String n) {
        super(n);
    }

    public void run() {
        System.out.println("Sandeep is in indor");
    }
}

public class threadconst {
    public static void main(String[] args) {

        sandeep obj = new sandeep("girl");
        sandeep obj2 = new sandeep("Chick");
        obj.start();
        obj2.start();
        System.out.println("The id of this thread is = " + obj.getId());
        System.out.println("The name of this thread is = " + obj.getName());
        System.out.println("The id of this thread is = " + obj2.getId());
        System.out.println("The name of this thread is = " + obj2.getName());
    }
}
