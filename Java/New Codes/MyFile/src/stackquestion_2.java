//Reverse a Stack

import java.util.*;
public class stackquestion_2 {
    
    static class Stack {
       static ArrayList<Integer> list = new ArrayList<>();

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            int top = list.get(list.size()-1);
            return top;
        }

        public static boolean isEmpty(){
            return list.size() == 0;
        }
    }

         public static void reversestack(Stack s){
        
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushAtBottom(top, s);
        }  


        public static void pushAtBottom(int data, Stack s){
        
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);

      }  
        public static void main(String[] args) {
         Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        reversestack(s);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }      
      } 
    }

