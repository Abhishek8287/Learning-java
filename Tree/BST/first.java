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
        }
        else if(root.data < key){
            return search(root.right, key);
        }
        else if(root.data == key){
            return true ;
        }
    }
    public  Node insert(Node root , int val) {
        
  
        

        if (root == null) {
            root = new Node(val);
            return root;
        }
        else {
           
            if (root.data > val) {
                root.left = insert(root.left, val);
            }
            else {
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
    }
}
