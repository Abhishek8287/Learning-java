import java.util.*;
class Stack{
    int arr[];
    int size;
    int top = -1;

    Stack(int item) {
        size = item;
        arr = new int[size];
        top = -1;
    }

    void push(int data) {
        if (top == size - 1) {
            System.out.println("stak is full");
            return;
        } else {
            arr[++top] = data;

        }
    }
    
    void pop() {
        if (top == -1) {
            System.out.println("stak is empty");
            return;
        } else {
            top--;
            

        }
    }

    int top() {
        int data = arr[top];
        return data;
    }

    void display() {
        int temp = top;
        while (temp != -1) {
            System.out.print(arr[temp] + " ");
            temp--;
        }
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    void getMin() {
        int temp = top;
        int min = Integer.MAX_VALUE;
        while (temp >= 0) {
            if (arr[temp] < min) {
                min = arr[temp];
            } 
            temp--;
        }
        System.out.println("minimun element in stack " + min);
    }
   

}


public class Minstack{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack st = new Stack(n);
        st.push(5);
        st.push(4);
        st.push(2);

        st.display();

        st.getMin();
    }
}
