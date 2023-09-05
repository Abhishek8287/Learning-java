import java.util.*;


class Stack {
    String arr[];
    int top;

    Stack() {
        arr = new String[100];
        top = -1;
    }

    void push(String c) {
        arr[++top] = c;
    }

    String pop() {
        return arr[top--];
    }

    boolean isEmpty() {
            return (top == -1)?true:false;
        }

    String peek() {
        return arr[top];
    }
}

public class postfixtoinfix {
     static boolean isOperator(char c){
        if(c == '+' || c == '-' || c=='*' || c=='/'){
            return true;
        }
        return false;
    }

    public static String toinfix(String postfix){
        Stack st = new Stack() ;
        int len = postfix.length();
        for (int i = 0; i < len; i++) {
            char c = postfix.charAt(i);
            if (isOperator(c)) {
                String b = st.pop();
                String a = st.pop();

                st.push("(" + a + c + b + ")");
            } else {
                st.push("" + c);
            }
        }
        
        return st.pop();
    }
    public static void main(String args[]) {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toinfix(str));
    }
}