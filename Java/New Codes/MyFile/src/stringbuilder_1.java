public class stringbuilder_1 {
    public static void main(String[] args) {

        StringBuilder greet = new StringBuilder("Hello");

        greet.append("s");
        greet.append("s");
        System.out.println(greet);

        greet.insert(3, "m");
        System.out.println(greet);

        greet.delete(3, 4);
        System.out.println(greet);

        greet.setCharAt(6, 'x');
        System.out.println(greet);
    }
}
