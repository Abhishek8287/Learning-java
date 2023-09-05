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
            int item = arr[top--];
            System.out.println("popped item " + item);

        }
    }

    int peek() {
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


}

public class first {
    public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int d = sc.nextInt();
        Stack st = new Stack(d);
        
    

        
        int ch = 1;
        while(ch != 0){
            System.out.println("Choose one option");
            
        System.out.println("1.Push");
        System.out.println("2.pop");
        System.out.println("3.peek");
        System.out.println("4.display");
        System.out.println("0 stop");
        int option = sc.nextInt();
        switch (option) {
            case 0:
                break;

            case 1:
                System.out.println("Enter data");
                int data = sc.nextInt();
                st.push(data);
                break;
            case 2:
                st.pop();
                break;
            case 3:
                System.out.println("top element " + st.peek());
                break;
            case 4:
                System.out.println("display stack element");

                st.display();
                break;

            default:
                System.out.println("wrong option");
                break;
        }
        System.out.println("Enter 0 if u want to stop and 1 to continue");
         ch = sc.nextInt();

        }
        
    }
}
