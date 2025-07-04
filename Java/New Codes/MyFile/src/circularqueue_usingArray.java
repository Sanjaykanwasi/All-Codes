public class circularqueue_usingArray {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size){
            arr = new int[size];
            this.size = size;
        }

        //EMPTY
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        //FULL
        public static boolean isFull(){ 
            return (rear + 1)%size == front;
        }

        //ADD
        public static void add(int data){
           if(isFull()){
            System.out.println("Queue is Full");
            return;
           }
           
            if(front == -1){
                front = 0;
            }
            
            rear = (rear+1) % size;
            arr[rear] = data;
            
        }

        //DELETE
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            // Single element condition
            if(rear == front){
                rear = front = -1;  
            } else {
                front = (front +1)% size;
            }
            return result;
        }

        //PEAK
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }

    }
    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);     
        
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
