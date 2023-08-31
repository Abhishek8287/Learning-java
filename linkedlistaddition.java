import java.util.*;


class Node {
        int data;
        int expo;
        Node next;

        Node(int d , int e) {
            data = d;
            expo = e;
            next = null;
        }
    }

    class linkedlist {
        Node head;

        public void insert(linkedlist list, int d, int e) {
            Node newNode = new Node(d, e);
            if (list.head == null) {
                list.head = newNode;
            } else {
                Node temp = list.head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;

            }
        }

        public void display(linkedlist list) {
            Node curr = list.head;
            while (curr != null) {

                System.out.print(curr.data + "x^" + curr.expo + "->");
                curr = curr.next;
            }
        }
    }

class addition {
    public void add(linkedlist list1, linkedlist list2) {
        linkedlist list = new linkedlist();
        Node temp1 = list1.head;
        Node temp2 = list2.head;
        Node curr = null;
        int carry = 0;

        while (temp1 != null && temp2 != null) {
            if (temp1.expo == temp2.expo) {
                int add = temp1.data + temp2.data;
                int digit = add % 10;
                int rem = add / 10;
                carry = rem + carry;
                list.insert(list, add, temp1.expo);
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else if (temp1.expo > temp2.expo) {
                list.insert(list, temp1.data, temp1.expo);
                temp1 = temp1.next;
            }
            else {
                list.insert(list, temp2.data, temp2.expo);
                temp2 = temp2.next;
            }
            if (curr == null) {
                curr = list.head;
            }
            else {
                curr = curr.next;
            }
        }
        
        while (temp1 != null) {

            list.insert(list, temp1.data, temp1.expo);
            temp1 = temp1.next;
            curr = curr.next;
        }
        
        while (temp2 != null) {
            list.insert(list, temp2.data, temp2.expo);
            temp2 = temp2.next;
            curr = curr.next;
        }
        
        list.display(list);
    }
}

public class linkedlistaddition {
    

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        linkedlist list2 = new linkedlist();
        addition addit = new addition();
        list.insert(list, 5 , 3 );
        list.insert(list ,6 , 2);
        list.insert(list, 8 , 1);
        list.insert(list, 7 , 0);

        list2.insert(list2, 4 , 2);
        list2.insert(list2, 9 , 1 );
        list2.insert(list2, 10 , 0);


        list.display(list);
        System.out.println();
        list2.display(list2);
        System.out.println();
        addit.add(list, list2);
        
        

    }
}
