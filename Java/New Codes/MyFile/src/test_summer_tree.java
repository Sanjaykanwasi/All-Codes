import java.util.*;

public class test_summer_tree {
   
   static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

   } 
   
   static class BinaryTree{
        static int index = -1;
        public static Node buildtree(int node[]){
           index++;

            if(node[index] == -1){
                return null;
            }

            Node newNode = new Node(node[index]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);
            
            return newNode; 
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

   }

    public static void main(String[] args) {
    int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildtree(node);
       System.out.println("Root data :");
       System.out.println(root.data);

       System.out.println("PRE ORDER TRAVERSAL :");
       tree.preorder(root);
        System.out.println();
       System.out.println("POST ORDER TRAVERSAL :");
       tree.postorder(root);
       System.out.println();
       System.out.println("IN ORDER TRAVERSAL :");
       tree.inorder(root);
   } 
}
