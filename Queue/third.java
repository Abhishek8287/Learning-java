import java.util.*;

class Qnode {
    int data;
    Qnode next;

    Qnode(int d) {
        data = d;
    }
}

class crcularwithLinkedlist {
    Qnode front, rear;

    void enqueue(int d) {
        Qnode temp = new Qnode(d);
        if (front == null) {
            front = rear = temp;
            rear.next = front;
            return;
        } else {
            rear.next = temp;
            rear = temp;
            rear.next = front;
        }
    }
    
    void deque() {
        if (front == null) {
            System.out.println("Queue is Empty");
            return;
        } else {
            if (front == rear) {
                int data = front.data;
                front = rear = null;
                System.out.println("dleed element " + data);
                return;
            } else {
                int data = front.data;

                front = front.next;
                rear.next = front;
                System.out.println("dleed element " + data);

            }
        }
    }
    
    void display() {
    if (front == null) {
        System.out.println("Queue is Empty");
        return;
    }

    Qnode temp = front;
    do {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    } while (temp != front);
    System.out.println();
}

}
public class third {
    public static void main(String args[]) {
        crcularwithLinkedlist q = new crcularwithLinkedlist();
        q.enqueue(14);
        q.enqueue(22);
        q.enqueue(6);

        q.display();
        q.deque();
        q.deque();

        q.display();
        q.enqueue(9);
        q.enqueue(20);
        q.display();
    }
}