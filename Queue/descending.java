import java.util.*;

import javax.print.event.PrintEvent;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

class proiorqueue {
    Node head;

    void insert(int k) {
        Node temp = new Node(k);
        if (head == null) {
            head = temp;
            return;
        } else {
            Node prev = null;
            Node curr = head;
            if (curr.data < k) {
                temp.next = curr;
                head = temp;
                return;
            } else {
                while ((curr.data > k) && curr != null) {
                    prev = curr;
                    curr = curr.next;

                }
                prev.next = temp;
                temp.next = curr;
            }
        }
    }

    void deque() {
        Node curr = head;
        if (head == null) {
            return;

        }
        else {
            head = head.next;
            System.out.println("deletd item " + curr.data);
        }
    }
    void display() {
        Node temp = head;
        if (temp == null) {
            return;

        }
        else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }
}

public class descending {
    public static void main(String args[]) {
        proiorqueue pq = new proiorqueue();
        pq.insert(1);
        pq.insert(3);
        pq.insert(10);
        pq.insert(12);
        pq.insert(2);
        pq.display();
        pq.deque();
        pq.display();

    }
}
