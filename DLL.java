
import java.util.*;
public class DLL {
    private Node head;
    private Node tail ;
    private int size = 0 ;

    public class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value = value;
        }

        Node(int value , Node next){
            this.value = value ;
            this.next = next ;
        }

        Node(int value , Node next , Node prev){
            this.value = value ;
            this.next = next ;
            this.prev = prev ;
        }
    }

    public void insert(int value){
        Node node = new Node(value);
        

        node.next = head;
        node.prev = null;
        if(head != null){head.prev = node;}
        head = node;
        size = size +1;

    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    public static void main(String []args){
        DLL List = new DLL();
        List.insert(10);
        List.insert(20);
        List.insert(30);
        List.insert(150);
        List.display();
        
    }
    
}
