import java.util.Scanner;
//wrong
class dequeue {
    static final int MAX = 100;
    int arr[];
    int front;
    int rear;
    int size,count;

    public dequeue(int size)
    {
        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
        count=0;
    }

    boolean isFull()
    {
        return ((front == 0 && rear == size - 1)
                || front == rear + 1);
    }


    boolean isEmpty() { return (front == -1); }

    // Inserts an element at front
    void insertfront(int key)
    {
        // check whether Deque if full or not
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }


        if (front == -1) {
            front = 0;
            rear = 0;
        }


        else if (front == 0)
            front = size - 1;

        else
            front = front - 1;

        arr[front] = key;
        count++;
    }


    void insertrear(int key)
    {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }


        if (front == -1) {
            front = 0;
            rear = 0;
        }

        // rear is at last position of queue
        else if (rear == size - 1)
            rear = 0;

            // increment rear end by '1'
        else
            rear = rear + 1;

        // insert current element into Deque
        arr[rear] = key;
        count++;
    }

    // Deletes element at front end of Deque
    void deletefront()
    {
        // check whether Deque is empty or not
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else
            // back to initial position
            if (front == size - 1)
                front = 0;

            else // increment front by '1' to remove current
                // front value from Deque
                front = front + 1;
            count--;
    }

    // Delete element at rear end of Deque
    void deleterear()
    {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
        count--;
    }

    // Returns front element of Deque
    int getFront()
    {
        // check whether Deque is empty or not
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

    // function return rear element of Deque
    int getRear()
    {
        // check whether Deque is empty or not
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }

    void display()
    {
        int i=front;
        System.out.print("elements are:");

        while(i!=rear)
        {
            System.out.print(arr[front]+" ");
            i=(i+1)%size;
        }
        System.out.println(arr[rear]+" ");
    }

    // Driver code
    public static void main(String[] args)
    {

        dequeue dq = new dequeue(5);
        int choice=0,value;
        Scanner sc = new Scanner(System.in);
        while(choice!=9){
            System.out.println("1-insertAtFront\n2-insertAtrear\n3-deleteFront\n4-deleterear\n5-getFront\n6-getrear\n7-display\n8-exit");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("enter the value to insert in front:");
                    value=sc.nextInt();
                    dq.insertfront(value);
                    break;
                case 2:
                    System.out.print("enter the value to insert in rear:");
                    value=sc.nextInt();
                    dq.insertrear(value);
                    break;
                case 3:
                    dq.deletefront();
                    break;
                case 4:
                    dq.deleterear();
                    break;
                case 5:
                    System.out.println("front element:"+dq.getFront());
                    break;
                case 6:
                    System.out.println("rear element:"+dq.getRear());
                    break;
                case 7:
                    dq.display();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("invalid key");
            }
        }



    }
}
