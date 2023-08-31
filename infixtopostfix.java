import java.util.*;

import javax.xml.crypto.Data;

class stack {
    static int top = -1 ;
    int arr[];
    int maxsize;

    stack(int s) {
        
        maxsize = s;
        arr = new int[maxsize];
    }

    boolean isFull() {
        if (top == maxsize - 1) {
            return true;
        } else {
            return false;
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

    public void push(int data) {
        if (isFull()) {
            
            System.out.println("Filled");
        } else {
            arr[++top] = data;
        }

    }
    
    public void pop() {
        if (isEmpty()) {
            
            System.out.println("empty");
            

        } else {
            int data = arr[top];
            top--;
            System.out.print(data+" ");
        }

    }
    
    public void peek() {
        if (isEmpty()) {
            System.out.println("empty");       }
        else {
            System.out.println(arr[top]); 
        }
    }
}

public class infixtopostfix {
    public static void main(String[] args) {
        stack st = new stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        while (!st.isEmpty()) {
            st.pop();
        }
        
    }
}