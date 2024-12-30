import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> sam = new Stack<Integer>();
        sam.push(5);
        sam.push(4);
        sam.push(3);
        sam.push(2);
        sam.push(1);
        System.out.println(sam);
        System.out.println(sam.peek());
        sam.pop();
        System.out.println(sam.peek());

    }
}
