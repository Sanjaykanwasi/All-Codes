class animal {
    private String sound;

    public void setsound(String s) {
        this.sound = s;
    }

    public String getsound() {
        return sound;
    }

}

class dog extends animal {
    private String noise;

    public String getNoise() {
        return this.noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

}

public class inherit {
    public static void main(String[] args) {

        dog obj2 = new dog();
        obj2.setsound("HAHAHAHHA");
        obj2.setNoise("wowowo");
        System.out.println(obj2.getNoise());
        System.out.println(obj2.getsound());
    }
}