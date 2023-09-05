import java.util.*;

class Queue {
    int size;
    int arr[];
    int front;
    int rear;

    Queue(int s) {
        size = s;
        arr = new int[size];
        front = 0;
        rear = 0;

    }

    void insert(int data) {
        if (front == size) {
            System.out.println("queue is full");
            return;
        } else {
            arr[rear] = data;
            rear++;
        }
    }
    
    void delete() {
        if (rear == front) {
            System.out.println("Queue is empty");
            return;
        } else {
            int item = arr[front];
            System.out.println("deleted item " + item);
            front++;
        }
    }
    
    void front() {
        System.out.println(arr[rear]);
    }

    void display() {
        int temp = front;
        while (temp < rear) {
            System.out.print(arr[temp] + " ");
            temp++;
        }
    }

    void countGreater() {
        int count = 1;
        int max = 0;

        for (int i = front; i < rear - 1; i++) {
            max = arr[i + 1];
            for (int j = i + 1; j < rear; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    count++;
                }
            }
            System.out.println(count + " ");
            count = 1;
        }
        System.out.println(0);
        
    }

}

public class first {
    public static void main(String args[]) {
        Queue qt = new Queue(7);
        qt.insert(5);
        qt.insert(10);
        qt.insert(2);
        qt.insert(11);
        qt.insert(3);
        qt.insert(8);
        qt.insert(12);

        qt.display();
        System.out.println();
        qt.countGreater();


    }
}
