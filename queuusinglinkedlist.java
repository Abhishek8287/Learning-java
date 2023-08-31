class Qnode {
    int data;
    Qnode next;

    Qnode(int d) {
        data = d;
    }
}

class Queue {
    Qnode front, rear;

    Queue() {
        front = rear = null;
    }

    void enqueue(int d) {
        Qnode node = new Qnode(d);

        if (rear == null) {
            front = rear = node;
        }

        else {
            rear.next = node;
            rear = node;
        }
    }

    void dequeue() {
    if (front == null) {
        System.out.println("empty");
    } else {
        front = front.next;
        if (front == null) {
            rear = null;
        }
    }
}
    void first() {
        if (front == rear) {
            System.out.println("Empty");
        }

        else {
            System.out.println(front.data);
        }
    }

    void display() {
        if (front == rear) {
            System.out.println("empty");
        }

        else {
            Qnode temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}


public class queuusinglinkedlist {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(112);
        q.enqueue(15);

        q.display();
        System.out.println();
        q.enqueue(14);
        q.enqueue(18);
        q.enqueue(17);
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println();
        q.display();
        System.out.println();
        q.first();
    }
}
