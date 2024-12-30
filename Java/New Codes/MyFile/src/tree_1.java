import java.util.*;
public class tree_1 {
    
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;
        }
    } 

    static class BinaryTree {
       static int indx = -1;
       
       // Building Tree
       public static Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
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

        //IN ORDER
        public static void inorder(Node root){
            if(root == null){
                return;
            }

            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
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

        //LEVEL ORDER TRAVERSAL
        public static void levelorder(Node root){

            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
        

            while(!q.isEmpty()){
               Node currnode = q.remove();
                if(currnode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else {
                        q.add(null);
                    }
                }else {
                    System.out.print(currnode.data + " ");
                    if(currnode.left != null){
                        q.add(currnode.left);
                    }
                    if(currnode.right != null){
                        q.add(currnode.right);
                    }
                }
            }
        }

        // Counting the Nodes through Recursion
        public static int countOfNodes(Node root){

            if(root == null) {
                return 0;
            }

            int leftnodes = countOfNodes(root.left);
            int rightnodes = countOfNodes(root.right);

            return leftnodes + rightnodes + 1;
        }

        //SUM OF NODES
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;
        }

        //HEIGHT OF TREE OR LEVEL
        public static int height(Node root){
            if(root == null){
                return 0;
            }

            int heightleft = height(root.left);
            int heightright = height(root.right);

            int max;
            if(heightleft>heightright){
                max = heightleft;
            }else {
                max = heightright;
            }

            return max + 1;
        }

        //DIAMETER OF TREE
        public static int diameter(Node root){
           if(root == null){
            return 0;
           }
           
            int diam1 = diameter(root.left);
            int diam2 = diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;

            return Math.max(diam3, Math.min(diam1, diam2));
        }

        // ARPOACH 2 FOR DIAMETER WITH O(n) TIME

        static class TreeInfo{
            int ht;
            int diam;

            TreeInfo(int ht, int diam){
                this.ht = ht;
                this.diam = diam;
            }
        }

        public static TreeInfo diameter2(Node root){

            if(root == null){
                
               return new TreeInfo(0,0);
            }
            
            TreeInfo  leftsub = diameter2(root.left);
            TreeInfo  rightsub = diameter2(root.right);

            int myht = Math.max(leftsub.ht, rightsub.ht) + 1;

            int diam1 = leftsub.diam;
            int diam2 = rightsub.diam;
            int diam3 = leftsub.ht + rightsub.ht + 1;

            int mydiam = Math.max(diam3, Math.max(diam2, diam1));

            TreeInfo myinfo = new TreeInfo(myht, mydiam);
            return myinfo;
        }
    }

    
    public static void main(String[] args) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; 
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildTree(nodes);
       System.out.println("Root data :");
       System.out.println(root.data);
       System.out.println("PRE ORDER TRAVERSAL :");
       tree.preorder(root);
       System.out.println();
       System.out.println("IN ORDER TRAVERSAL :");
       tree.inorder(root);
       System.out.println();
       System.out.println("POST ORDER TRAVERSAL :");
       tree.postorder(root);
       System.out.println();
       System.out.println("LEVEL ORDER TRAVERSAL :");
       tree.levelorder(root);
       System.out.println("TOTAL NUMBER OF NODES :");
       System.out.println(tree.countOfNodes(root));
       System.out.println("SUM OF NODES :");
       System.out.println(tree.sumOfNodes(root));
       System.out.println("HEIGHT OR LEVEL OF TREE :");
       System.out.println(tree.height(root));
       System.out.println("DIAMETER OF TREE :");
       System.out.println(tree.diameter(root));
       System.out.println(tree.diameter2(root).diam);
    }
}
