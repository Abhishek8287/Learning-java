import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
        data = d;
    }

}

class Tree{
    Node root;

    Node create() {
        Node root = null;
        System.out.println("Enter value ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        } else {
            Node newNode = new Node(data);
            root = newNode;
            System.out.println("enter left child of " + root.data);
            root.left = create();
            System.out.println("Enter right child of " + root.data);
            root.right = create();
            return root;

        }
    }
    
    public void preOrder(Node temp) {
        if (temp == null) {
            return;
        } else {
            System.out.print(temp.data + " ");
            preOrder(temp.left);
            preOrder(temp.right);
        }

    }
    
    public void postOrder(Node temp) {
        if (temp == null) {
            return;
        } else {
            postOrder(temp.left);
            postOrder(temp.right);
            System.out.print(temp.data + " ");
        }
    }
    
    public void Inorder(Node temp) {
        if (temp == null) {
            return;
        } else {
            Inorder(temp.left);
            System.out.print(temp.data + " ");
            Inorder(temp.right);
        }
    }
    
    public int count(Node root) {
        if (root == null)
            return 0;
        int leftNode = count(root.left);
        int rightNode = count(root.right);

        return (leftNode + rightNode + 1);

    }

    public int sum(Node root) {
        if (root == null)
            return 0;
        else {
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);

            return leftSum + rightSum + root.data;
        }
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int myheight = -1 ;
            if(leftHeight > rightHeight)
                {
                    myheight = leftHeight ;
                }
            else{
                myheight = rightHeight ;
            }


            return (myheight + 1);
        }
    }
}
public class first
{
    public static void main(String args[]) {
        Tree tr = new Tree();
        Node root = tr.create();
        tr.preOrder(root);
        System.out.println();
        tr.postOrder(root);
        System.out.println();
        tr.Inorder(root);
        System.out.println();
        int result = tr.count(root);

        System.out.println(result);

        int Sum = tr.sum(root);
        System.out.println(Sum);
        System.out.println();
        int length = tr.height(root);
        System.out.println(length);
}

}