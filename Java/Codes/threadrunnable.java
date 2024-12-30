class shivam implements Runnable {
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("Shivam is making filter");
            i++;
        }
    }
}

class anuj implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("Anuj is playing Valo");
            i++;
        }
    }
}

public class threadrunnable {
    public static void main(String[] args) {
        shivam obj = new shivam();
        Thread go = new Thread(obj);
        anuj obj2 = new anuj();
        Thread go2 = new Thread(obj2);
        go.start();
        go2.start();
    }
}
