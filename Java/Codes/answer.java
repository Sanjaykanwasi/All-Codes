class monkey {
    public void bite() {
        System.out.println("Biting");
    }

    public void eat() {
        System.out.println("Banana");
    }
}

interface Basicanimal {
    public void sleep();

    public void run();
}

class human extends monkey implements Basicanimal {
    public void sleep() {
        System.out.println("SLeeping");
    }

    public void run() {
        System.out.println("Running");
    }

    public void think() {
        System.out.println("Thinking");
    }
}

public class answer {
    public static void main(String[] args) {
        human obj = new human();
        obj.think();
        obj.run();
        obj.sleep();
        obj.eat();
        obj.bite();
    }
}
