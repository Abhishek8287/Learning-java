import java.util.*;

class Stack{
    char arr[];
    int size;
    int top = -1;

    Stack(int item) {
        size = item;
        arr = new char[size];
        top = -1;
    }

    void push(char data) {
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

    char peek() {
        char data = arr[top];
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
        }
        else {
            return false;
        }
    }
   

}


public class second {
    public static void main(String args[]) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack st = new Stack(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                st.display();
            } else if (ch == ')' || ch == '}' || ch == ']') {
                char temp = st.peek();
                if ((temp == '(' && ch == ')') || (temp == '{' && ch == '}') || (temp == '[' && ch == ']')) {
                    st.pop();
                }
            } else {
                continue;
            }

        }
        if (st.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}
