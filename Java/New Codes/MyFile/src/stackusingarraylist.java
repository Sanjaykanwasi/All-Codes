import java.util.*;
public class stackusingarraylist {
    static class Stack {
       static ArrayList<Integer> list = new ArrayList<>();
        
        public static boolean isEmpty(){
            return list.size() == 0;
        }


       //PUSH Function
       public static void push(int data){
        list.add(data);
       }

       //POP Function
       public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
       }

       //PEEK Function
       public static int peek(){
        if(isEmpty()){
            return -1;
        }
      
        int top = list.get(list.size()-1);
        return top;
       }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.pop();

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }        
    }
}
