import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class PriorityQueue {
    LinkedList list;

    public PriorityQueue() {
        list = new LinkedList();
    }

    public void enqueue(int value) {
        list.append(value);
        // Sort the linked list after each enqueue operation
        sortLinkedList();
    }

    private void sortLinkedList() {
        // Implementation of sorting the linked list in ascending order
        // (You can use any sorting algorithm here)
        // For simplicity, we'll use a basic bubble sort in this example.

        Node current = list.head;
        Node index = null;
        int temp;

        if (current == null) {
            return; // Empty list, nothing to sort
        }

        while (current != null) {
            index = current.next;

            while (index != null) {
                if (current.data > index.data) {
                    // Swap data
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Priority queue is empty.");
        }
        int value = list.head.data;
        list.head = list.head.next;
        return value;
    }

    public boolean isEmpty() {
        return list.head == null;
    }

    public void display() {
        list.display();
    }
}

public class ascending {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Priority Queue Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    pq.enqueue(value);
                    System.out.println("Enqueued: " + value);
                    break;

                case 2:
                    try {
                        int dequeuedValue = pq.dequeue();
                        System.out.println("Dequeued: " + dequeuedValue);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Priority Queue: ");
                    pq.display();
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
