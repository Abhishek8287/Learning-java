import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int k) {
        data = k;
    }

}

class Pqusingdll {
    Node head;
    Node front, rear;

    void insertfirst(int i) {
        Node temp = new Node(i);
        if (head == null) {
            head = temp;
            rear = front = head;
            return;
        } else {
            front.prev = temp;
            temp.next = front;
            head = temp;
            front = temp;
        }
    }
    
    void insertLast(int item) {
        Node temp = new Node(item);
        if (head == null) {
            head = temp;
            front = rear = head;
            return;
        } else {
            rear.next = temp;
            temp.prev = rear;
            rear = temp;
        }
    }

    void deletefirst() {
        if (front == null) {
            System.out.println("Empty stack");
            return;
        } 
        else if (front == rear) {
            front = rear = null;
        } else {
            head = head.next;
            front = head;
        }
    }
    
    void deletelast() {
        if (rear == null) {
            System.out.println("Empdf");
            return;
        }
        else if (front == rear) {
            front = rear = null;
        }
        else {
            rear = rear.prev;
            rear.next = null;
        }
    }
    
    void display() {
        Node curr = head;
        if (head == null) {
            System.out.println("emot");
            return;
        } else {
            while (curr != null) {
                System.out.print(curr.data + "->");
                curr = curr.next;
            }
        }
    }
    
    void getFront() {
        if (head == null) {
            System.out.println("empty ");
        } else {
            System.out.println("front element " + front.data);
        }
    }

    void getrear() {
        System.out.println("last element "+rear.data);
        return;
    }
}
public class  deque {
    public static void main(String args[]){
        Pqusingdll dq = new Pqusingdll();
        dq.insertfirst(10);
        dq.insertfirst(12);
        dq.insertfirst(15);
        dq.display();
        System.out.println();
        dq.insertLast(41);
        dq.insertLast(4);
        dq.insertLast(80);
        dq.display();
        System.out.println();
        dq.deletefirst();
        dq.display();
        System.out.println();
        dq.deletelast();
        dq.display();
        dq.deletelast();
        System.out.println();
        dq.display();
        dq.getFront();
        dq.getrear();
         dq.deletelast(); dq.deletelast(); dq.deletelast(); dq.deletelast();
    }
}
