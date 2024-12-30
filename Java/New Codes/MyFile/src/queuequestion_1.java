//Queue implementation using 2 stacks
import java.util.*;
public class queuequestion_1 {
    
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        //Empty Function
        public static boolean isEmpty(){
             return s1.isEmpty();
        }

        //Enqueue Function
        public static void add(int data){

           while(!s1.isEmpty()){
                 s2.push(s1.pop());      
            }
            s1.push(data);
                
         while(!s2.isEmpty()){
                 s1.push(s2.pop());
             }     
        }

        //Dqueue function
        public static int remove(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        } 

        //Front function
        public static int peek(){
            if(s1.isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    } 
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(4);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
