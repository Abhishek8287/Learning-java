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
    
    int pop() {
        if (top == -1) {
            System.out.println("stak is empty");
            return -1;
        } else {
            int item = arr[top--];
            return item;

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

public class evaluation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack st = new Stack(str.length());

        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != '+' && ch != '-' && ch != '*' && ch != '/' ) {
                st.push(ch - '0');
            } else {
                int val1 = st.pop();
                int val2 = st.pop();

                switch (ch) {
                    case '+':
                        st.push(val2 + val1);
                        break;
                    case '-':
                        st.push(val2 - val1);
                        break;
                    case '/':
                        st.push(val2 / val1);
                        break;
                    case '*':
                        st.push(val2 * val1);
                        break;
                }
            }
        }
        System.out.println(st.pop());
    }
}