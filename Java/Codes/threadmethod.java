
class abhishek extends Thread {
    public void run() {
        int i = 1;
        while (i < 100) {
            System.out.println("Abhishek is chutiya");
            i++;
        }
    }
}

class sanjay extends Thread {
    @Override
    public void run() {
        int j = 1;
        while (j < 100) {
            System.out.println("Sanjay is good");
            j++;
        }
    }

}

public class threadmethod {
    public static void main(String[] args) {
        abhishek obj = new abhishek();
        sanjay obj2 = new sanjay();
        obj.start();
        try {

            obj.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        obj2.start();

    }
}
