import java.util.ArrayList;

public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Building the tree
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        // left tree
        if (root.data > val) {
            root.left = insert(root.left, val);
        }
        // right tree
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Searching

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data > key) { // left side
            return search(root.left, key);
        }

        else if (root.data == key) {
            return true;
        }

        else { // right side
            return search(root.right, key);
        }
    }

    // PREORDER
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Deleting a node
    public static Node deletenode(Node root, int key) {
        // searching the node that has to be deleted
        if (root.data > key) {
            root.left = deletenode(root.left, key);
        }

        else if (root.data < key) {
            root.right = deletenode(root.right, key);
        }

        else { // root.data == key

            // case 1 when no child node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 when only 1 child node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 when 2 child nodes
            Node IS = inordersucc(root.right);
            root.data = IS.data;
            root.right = deletenode(root.right, IS.data);

        }
        return root;
    }

    // Inorder Sucessor
    public static Node inordersucc(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Print in Range
    public static void printinrange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }

        // case1
        if (root.data >= X && root.data <= Y) {
            printinrange(root.left, X, Y);
            System.out.print(root.data + " ");
            printinrange(root.right, X, Y);
        }

        // case2
        else if (root.data >= Y) {
            printinrange(root.left, X, Y);
        } else {
            printinrange(root.right, X, Y);
        }
    }

    // Print leaf2Node
    public static void leaf2Node(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);
        // leaf
        if (root.left == null && root.right == null) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + "->");
            }
            System.out.println();
        }
        // non-leaf
        else {
            leaf2Node(root.left, path);
            leaf2Node(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    // Main Function
    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        if (search(root, 7)) {
            System.out.println("Key Found");
        } else {
            System.out.println("Not Found");
        }

        // deletenode(root, 4);
        // inorder(root);

        printinrange(root, 3, 12);
        System.out.println();
        leaf2Node(root, new ArrayList<>());
    }
}
