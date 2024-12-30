interface ashu {
    public void run();

}

public class lambda {
    public static void main(String[] args) {

        ashu obj = () -> {
            System.out.println("Ashu run!!!!!!!!");
        };
        obj.run();
    }
}

// Lambda is used to directly run a method of interface without creating a
// class.