import java.util.*;

class pQueue {
    int size;
    int arr[];
    int count;

    pQueue(int s) {
        size = s;
        count = 0;
        arr = new int[size];
    }

    public void insert(int ele) {
        int j;
        if (count == 0)//first element in pQueue
        {
            arr[count++] = ele;

        } else {
            for (j = count - 1; j >= 0; j--) {
                if (ele > arr[j]) {
                    arr[j + 1] = arr[j]; //shifting
                } else {
                    break;
                }

            }

            arr[j + 1] = ele;
            count++;
        }
    }
    
    public void remove() {
        int ele = arr[0];

        for (int i = 1; i < count; i++) {
            arr[i - 1] = arr[i];
        }

        count--;

        System.out.println(ele + " ");
    }

    public void display() {
        System.out.println("Priority queue :- ");
        for (int i = 0; i < count ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void peek() {
        System.out.println(arr[count-1]);
    }
}

public class priorityqueue {
    public static void main(String[] args) {
        pQueue p = new pQueue(10);
        p.insert(10);
        p.insert(15);
        p.insert(22);
        p.insert(5);
        p.insert(4);

        p.display();
        System.out.println();
        p.remove();
        System.out.println();
        p.display();
        System.out.println();

        p.peek();
    }
}