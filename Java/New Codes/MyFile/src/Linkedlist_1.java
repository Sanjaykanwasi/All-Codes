public class Linkedlist_1 {

    Node head;
    private int size;

    Linkedlist_1(){
        this.size =0;
    }

    class Node{
        String data;
        Node next;
        
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    
    // add in begning
    public void addfirst(String data){
        
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head = newnode;
    }

    // add in ending

    public void addend(String data){
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
           head.next = null;

           return Newhead;
        }
    // Reversing the list   
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
        Linkedlist_1 list = new Linkedlist_1();
        
        list.addfirst("a");
        list.addfirst("is");
        list.addend("list");
        list.addfirst("This");
       // list.printlist();
      //  list.deletestart();
      //  list.deletestart();
      //  list.deleteend();
     //   list.addfirst("is");

        list.printlist();
        System.out.println(list.getsize());
        list.head =  list.reverserecursion(list.head);
        list.printlist();
    }
}
