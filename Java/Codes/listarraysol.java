import java.util.ArrayList;

public class listarraysol {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Student 1");
        a1.add("Student 2");
        a1.add("Student 3");
        a1.add("Student 4");
        a1.add("Student 5");

        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
    }
}
