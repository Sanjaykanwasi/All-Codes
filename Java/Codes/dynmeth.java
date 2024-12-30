class phone {
    public void time() {
        System.out.println("Show time");
    }

    public void on() {
        System.out.println("Turning on Phone");
    }

}

class smartphone extends phone {
    @Override
    public void time() {
        System.out.println("Show time of smartphone");
    }

    public void music() {
        System.out.println("Play music");
    }
}

public class dynmeth {
    public static void main(String[] args) {

        phone obj = new smartphone();
        obj.time();
        obj.on();

        // obj.music(); Not allowed
    }
}
