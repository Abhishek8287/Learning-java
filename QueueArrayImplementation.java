import java.io.*;

class Queue {
        private static int front, rear, capacity;
        private static int arr[];

        Queue(int size) {
            front = 0;
            rear = -1;
            capacity = size;
            arr = new int[capacity];
        }

        static void insert(int item) {
            if (rear == capacity - 1) {
                System.out.println("Filled");
                return;
            } else {
                rear = rear + 1;
                arr[rear] = item;
            }
        }
        
        static void delete() {
            if (front == rear) {
                System.out.println("Empty");
                return;
            } else {
                front = front + 1;
            }
        }
        
        static void printList() {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        static void firstElement() {
            if (front == rear) {
                System.out.println("empty");
                return;
            }
            else {
                System.out.println(arr[front]);
            }
        }

    }

public class QueueArrayImplementation {
    

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(5);
        q.insert(52);
        q.insert(51);
        q.insert(56);

        q.printList();
        System.out.println();
        q.delete();q.delete();
        q.printList();
        System.out.println();
        q.firstElement();
    }
    
}