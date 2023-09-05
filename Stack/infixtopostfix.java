import java.util.*;


class Stack {
    char arr[];
    int top;

    Stack() {
        arr = new char[100];
        top = -1;
    }

    void push(char c) {
        arr[++top] = c;
    }

    char pop() {
        return arr[top--];
    }

    boolean isEmpty() {
            return (top == -1)?true:false;
        }

    char peek() {
        return arr[top];
    }
}


public class infixtopostfix {
    
     public static int prec(char c) {
        if (c == '^') {
            return 3;
        }
        else if (c == '*' || c == '/' || c =='%') {
            return 2;
        }
        else if (c == '+' || c == '-') {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static String toPostfix(String str) {
         Stack st = new Stack();
        int len = str.length();
       
        String postfix = new String("");
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                postfix = postfix + ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (st.peek() != '(' && !st.isEmpty()) {
                    postfix = postfix + st.pop();
                }
                st.pop();
            } else {
                while ((!(st.peek() == '(') && !st.isEmpty() && prec(ch) <= prec(st.peek()))) {
                    postfix = postfix + st.pop();
                }
                st.push(ch);
            }

        }
        
        while (!st.isEmpty()) {
                postfix = postfix + st.pop();

            }
        return postfix;
    }
    
   
    public static void main(String args[])
    {
        System.out.println("ENter string :- ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("infix string " + str);
        System.out.println(toPostfix(str));
    }
}

