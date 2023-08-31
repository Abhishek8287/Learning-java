import java.util.*;


public class stackusingLinked {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

        
    }
    public  static class Stack {
        public static Node head = null;//head of linked list and top of stack
        
        //----------checking linked list is empty or not
        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            else {
                return false;
            }
        }
        //-----------push--------

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
        
        //-----------------------delete using pop element-----------------
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //-------------------------------------peek/ getting top element------------

        public  int peek() {
            if (isEmpty()) {
                return -1;
            }

            int top = head.data;
            return top;
        }
        

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(20);
        s.push(15);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
