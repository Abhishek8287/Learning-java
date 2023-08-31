import java.util.*;

class Node {
    int data;
    Node lchild;
    Node rchild;

    Node(int item) {
        data = item;
        lchild = rchild = null;
    }
}

class tree {
    Node root;

    public void insert(int i) {
        Node newNode = new Node(i);
        if (root == null) {
            root = newNode;
        }

        else {
            Node current = root;
           

            while (true) {
                
                if (i <= current.data) {
                    if (current.lchild == null) {
                        current.lchild = newNode;
                        return;
                    }
                    current = current.lchild;
                } else {
                    if (current.rchild == null) {
                        current.rchild = newNode;
                        return;
                    }
                    current = current.rchild;
                }
            }
        }
    }
    
    public void inorder(Node localroot) {

        //ldr

        if (localroot == null) {
            return;
        }
        inorder(localroot.lchild);
        System.out.println(localroot.data + " ");
        inorder(localroot.rchild);
    }

    public void preorder(Node localroot) {
        //dlr
        if (localroot == null) {
            return;
        }
        System.out.print(localroot.data + " ");
        preorder(localroot.lchild);
        preorder(localroot.rchild);
    }

    public void postorder(Node loacalroot) {
        if (loacalroot == null) {
            return;
        }
        //lrd
        postorder(loacalroot.lchild);
        postorder(loacalroot.rchild);
        System.out.println(loacalroot.data);

    }

    public void search(int key) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }

        else {
            Node curr = root;
            while (true) {
                if (curr == null) {
                    System.out.println("not found");
                    return;
                }
                if (curr.data == key) {
                    System.out.println("item found");
                    return;
                }
                else if (key > curr.data) {
                    curr = curr.rchild;
                }
                else if (key <= curr.data) {
                    curr = curr.lchild;
                }
                else {
                    System.out.println("Not found");
                    return;
                }
            }
            
        }
    }
}

public class Binarysearchtree {
    
    public static void main(String args[]) {
        tree t = new tree();
        t.insert(14);
        t.insert(15);
        t.insert(4);
        t.insert(9);
        t.insert(7);
        t.insert(7);
        System.out.println("output");
        t.inorder(t.root);
        System.out.println();
        t.postorder(t.root);
        System.out.println();
        t.preorder(t.root);

        System.out.println("Enter key u want to search ");
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        t.search(val);


    }
}
