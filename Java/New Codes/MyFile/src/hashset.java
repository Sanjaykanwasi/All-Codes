import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //Adding
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Searching
        if(set.contains(2)){
            System.out.println("True");
        }

        //Delete
        set.remove(2);

        if(set.contains(2)){
            System.out.println("True");
        } else System.out.println("False");

        //Size
        System.out.println("Size of the HashSet is = " + set.size());

        //Print
        System.out.println(set);

        //Iterator
        Iterator i = set.iterator();

        //hasnext = gives true and false if there is next value or not
        //next  = points to the value and returns it values

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}

