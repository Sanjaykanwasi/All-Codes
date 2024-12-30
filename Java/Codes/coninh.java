class grandfather {
    grandfather() {
        System.out.println("I am Grandfather");
    }

    grandfather(int x) {
        System.out.println("I am Grandfather No =" + x);
    }
}

class father extends grandfather {
    father() {
        System.out.println("I am Father");
    }

    father(int x, int y) {
        super(x);
        System.out.println("I am Father No =" + y);
    }
}

class son extends father {
    son() {
        System.out.println("I am son");
    }

    son(int x, int y, int z) {
        super(x, y);
        System.out.println("I am son No =" + z);
    }
}

public class coninh {
    public static void main(String[] args) {
        son obj = new son(1, 2, 3);

    }
}
