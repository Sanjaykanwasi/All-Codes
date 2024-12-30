class monkey {

    public void jump() {
        System.out.println("Jumping");
    }

    public void bite() {
        System.out.println("Bitting");
    }
}

interface basicanimal {
    public void eat();

    public void sleep();

}

class human extends monkey implements basicanimal {
    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }
}

public class abstractexer {
    public static void main(String[] args) {

        human ashu = new human();
        ashu.eat();
        ashu.sleep();
        ashu.bite();
        ashu.jump();

    }
}
