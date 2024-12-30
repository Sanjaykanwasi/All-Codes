public class test_Summer_BST {
    
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

      //Insertion
        public static Node insert(Node root, int val){
            if(root ==null){
                root = new Node(val);
                return root;
            }

            if(root.data>val){
                //left 
                root.left = insert(root.left, val);
            }

            else {
                //right
                root.right = insert(root.right, val);
            }

            return root;
        }

        //PRE ORDER 
        public static void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " "); 
            preorder(root.left);
            preorder(root.right);
        }

        //POST ORDER
        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

         //IN ORDER
        public static void inorder(Node root){
            if(root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

    
    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7};

        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]); 
        }
        System.out.println("PRE ORDER =");
        preorder(root);
        System.out.println();
        System.out.println("POST ORDER =");
        postorder(root);
        System.out.println();
        System.out.println("IN ORDER =");
        inorder(root);
    }
}  


