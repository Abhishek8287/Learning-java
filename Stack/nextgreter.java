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

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        else {
            return false;
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

public class nextgreter {
    public static void main(String args[]) {
        Stack st = new Stack(100);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        System.out.println("Enter array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int result[] = new int[n];
        int ans[] = new int[n];

        //finding next greater element
        for (int i = n-1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty() == false) {
                result[i] = st.peek();
            } else {
                result[i] = -1;
            }

            st.push(arr[i]);
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }

        //Next smallest element to left

        System.out.println("Enter array elements ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();

        }
        int min;
        for (int i = 0; i < n; i++) {
            min = -1;
            for (int j = i - 1; j >= 0; j--) {
                
                if (arr2[j] < arr2[i]) {
                    min = arr2[j];
                    break;
                }
            }
            ans[i] = min;

        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+ " ");
        }

    }
}