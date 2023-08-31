import java.util.*;

class Queue {
    int front, rear, capacity;
    int queue[];

    Queue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    void insert(int d) {
        //Queue is filled
        if (rear == capacity) {
            System.out.println("Filled");
            return;
        }

        else {
            queue[rear] = d;
            rear++;
        }
    }

    void delete() {
        if (front == rear) {
            System.out.println("Empyty");
            return;

        } else {
            front = front + 1;
        }
    }
    
    void firstElement() {
        if (front == rear) {
            System.out.println("Empty");
            return;
        } else {
            System.out.println(queue[front]);
            return;
        }
    }
    
    void display() {
        if (front == rear) {
            System.out.println("Empty");
            return;
        }
        else {
            int i;
            for (i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        
    }
}

public class queueusingarray {
    public static void main(String[] args) {
        Queue list = new Queue(10);

        list.insert(15);
        list.insert(16);
        list.insert(17);
        list.insert(18);

        list.display();

        list.delete();
        System.out.println();
        list.display();
        list.firstElement();


    }
}
