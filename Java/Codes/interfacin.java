interface cycle {
    public void brake(int decrement);

    public void speed(int accelerate);
}

interface car {
    public void mode();

    public void horn();
}

class vehicle implements cycle, car {

    public void brake(int decrement) {
        int speed = 10 - decrement;
        System.out.println("Speed is =" + speed);
    }

    public void speed(int accelerate) {
        int newspeed = 10 + accelerate;
        System.out.println("New speed is =" + newspeed);
    }

    public void mode() {
        System.out.println("You are Now on Sports Mode");
    }

    public void horn() {
        System.out.println("Press horn");
    }
}

public class interfacin {
    public static void main(String[] args) {

        vehicle obj = new vehicle();
        obj.brake(5);
        obj.speed(5);
        obj.mode();
        obj.horn();
        System.out.println("THE END");
    }
}
