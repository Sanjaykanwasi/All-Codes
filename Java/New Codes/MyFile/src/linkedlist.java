import java.util.LinkedList;
public class linkedlist {
  public static void main(String[] args) {
    LinkedList<Integer> list1 = new LinkedList<Integer>();
    list1.add(1);
    list1.add(2);
    list1.add(4);
    list1.add(5);
    list1.addFirst(0);
    list1.addFirst(11);
    list1.add(6);
    list1.remove(4);
    System.out.println(list1);
    
    
    
   } 
}
