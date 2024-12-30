class valo extends Thread {
    public void run() {
        int i = 1;
        while (i < 200) {
            System.out.println("LEts play valo");
            i++;
        }

    }
}

class bgmi extends Thread {
    public void run() {
        int i = 1;
        while (i < 100) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }

            System.out.println("LEts play bgmi");
            i++;
        }

    }
}

public class threadsleep {
    public static void main(String[] args) {
        valo t1 = new valo();
        bgmi t2 = new bgmi();
        t1.start();
        t2.start();
    }
}
