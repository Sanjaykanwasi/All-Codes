import java.util.LinkedList;

public class test_questionreversell {
    
    public static void  reverseList(LinkedList<String> list1){
        LinkedList<String> list2 = new LinkedList<>();

        for(int i= list1.size()-1; i>= 0; i--){
            list2.add(list1.get(i));
        }
       System.out.println(list2);
    }
    
    
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();

        list1.add("This");
        list1.add("is");
        list1.add("a");
        list1.add("List");

        System.out.println(list1);

        reverseList(list1);
    }
}
