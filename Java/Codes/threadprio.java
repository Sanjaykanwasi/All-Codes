class ashu extends Thread {
    public ashu(String name) {
        super(name);
    }

    public void run() {
        int i = 1;
        while (i < 20) {
            System.out.println("I am " + this.getName());
            i++;
        }
    }
}

public class threadprio {
    public static void main(String[] args) {
        ashu obj = new ashu("sam");
        ashu obj2 = new ashu("don");
        ashu obj3 = new ashu("mon");
        obj.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(Thread.MIN_PRIORITY);
        obj3.setPriority(Thread.MIN_PRIORITY);
        obj.start();
        obj2.start();
        obj3.start();
    }
}
