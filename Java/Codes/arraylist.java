import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(15);
        l2.add(75);
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(9);
        l1.add(0, 1);

        l1.addAll(l2);
        // l1.clear();
        l1.set(2, 69);

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

    }
}
