
import java.util.*;
import java.util.ArrayList;

public  class StackClass {

    public static class Stack
    {
        static ArrayList<Integer> list = new ArrayList<>();
        //------------check for empty---------

        public static boolean isEmpty() {
            if (list.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isFull(int size) {
            if (list.size() == size) {
                return true;
            }
            else {
                return false;
            }
        }
        
        //--------------------push in stack--------------------

        public static void push(int data) {
            list.add(data);
        }
        //--------------------------pop from stack-----------------

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //------------------------------peek element---------------
        public static int peek() {

            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }


    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(20);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
            
        }
    }
}
