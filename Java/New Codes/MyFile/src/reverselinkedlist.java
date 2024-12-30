
// using recursion for reversing linked list

public class reverselinkedlist {

    Node head;
    private int size;

    reverselinkedlist(){
        this.size =0;
    }

    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    // add in begning
    public void addfirst(int data){
        
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // add in ending

    public void addend(int data){
        Node newnode = new Node(data);
        if(head ==null){
            head = newnode;
            return;
        }

        Node currentnode = head;

        while(currentnode.next != null){
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;
    }
    // deleting from start

        public void deletestart(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            size--;
            head = head.next;
        }

    // deleting from end

        public void deleteend(){
            if(head ==null){
                System.out.println("List is empty");
                return;
            }

            size--;
            if(head.next == null){
                head = null;
                return;
            }

            Node secondlast = head;
            Node lastnode = head.next;

            while(lastnode.next != null){
                lastnode = lastnode.next;
                secondlast = secondlast.next;
            }
            secondlast.next = null;
        }

        //size counting

        public int getsize(){
            return size;
        }
        //Reversing through Recursion

        public Node reverserecursion(Node head){

            if(head == null || head.next ==null){
                return head;
            }

           Node Newhead = reverserecursion(head.next);
           head.next.next = head;
           head = null;

           return Newhead;
        }
    
        // Reversing the list through iteration

    public void reverselist(){

        if(head == null || head.next == null){
            return;
        }
        
        Node prevnode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevnode;

            //updation
            prevnode = currNode;
            currNode = nextNode; 
        }

        head.next = null;
        head = prevnode;
    }

    // printing the list
    public void printlist(){ 
       
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
       
        Node currentnode = head; 
       
        while(currentnode != null){
           System.out.print(currentnode.data + " ->" );
            currentnode = currentnode.next;
        }
       
        System.out.println("Null");
    }
    
    public static void main(String[] args) {
        reverselinkedlist list = new reverselinkedlist();
        
        list.addfirst(1);
        list.addend(2);
        list.addend(3);
        list.addend(4);
        list.addend(5);
        list.addend(6);

        list.head = list.reverserecursion(list.head);
        list.printlist();
    }
}
