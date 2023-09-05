import java.nio.file.NotDirectoryException;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
    }
}

class BST {
    public void Inorder(Node temp) {
        if (temp == null) {
            return;
        } else {
            Inorder(temp.left);
            System.out.print(temp.data + " ");
            Inorder(temp.right);
        }
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data < key) {
            return search(root.right, key);
        } else {
            return true;
        }
    }

    public Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            //case 1
            if (root.left == null && root.right == null) {
                return null;
            }
            //case 2
            else if (root.left == null) {
                return root.right;
            }

            //case 3 
            Node is = inorderSuccesor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);

        }
        return root;
    }

    public Node inorderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        } else {

            if (root.data > val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
        }

        return root;
    }
}
public class first {
    public static void main(String args[]) {
        BST bt = new BST();
        Node root = null;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("enter value");
            int val = sc.nextInt();
            root = bt.insert(root, val);
        }
        System.out.println();
        bt.Inorder(root);
        int n = sc.nextInt();
        System.out.println(bt.search(root, n));
        bt.delete(root, 4);
        bt.Inorder(root);
    }
}
