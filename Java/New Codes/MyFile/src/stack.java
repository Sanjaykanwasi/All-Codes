public class stack {
   static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        public static Node head;
        
        //EMPTY FUNCTION
        public static boolean isEmpty(){
            return head == null;
        }

        // PUSH FUNCTION
        public static void push(int data){
           Node newnode = new Node(data);
           
            if(isEmpty()){
                head = newnode;
                return;
            }

            newnode.next = head;
            head = newnode;
        }

        //POP FUNCTION
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top; 
        }

        //PEAK FUNCTION
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
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
