
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
    //Insertion at first
    public void insertFirst(int value){
        Node node = new Node(value);
        if(head == null){
            head = node ;
            node.next = null ;
            node.prev = null;
            return ;
        }

        node.next = head;
        node.prev= null;
        head.prev = node;
        head = node ;
        size++;


    }
   
    public void insert(int value){
        Node node = new Node(value);
        

        node.next = head;
        node.prev = null;
        if(head != null)
        {head.prev = node;}
        head = node;
        size = size +1;

    }
    //insertion at last
    public void insertLast(int value){
        Node node = new Node(value);
        Node temp = head;
        if(temp==null){
            node.prev= null;
            head=node;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next =node;
        node.next= null;
        node.prev=temp;
        temp =node;
    }

    //Insertion at any index

    public void insertAtindex(int value , int index){
        Node node = new Node(value);
        Node temp = head ;
        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index==size-1){
            insertLast(value);
            return ;
        }

        for(int i = 1 ; i< index ; i++){
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;
    }
     //to find the previous value of a node
     public void findpre(int x){
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next ;
            if(temp.value ==x){
                System.out.println(temp.prev.value);
                break;
            }
        }
        return;
     }
    public void display(){
        Node temp = head;
        Node last =null;
        while(temp != null){
            System.out.print(temp.value+"->");
            last =temp;
            temp = temp.next;

        }
        System.out.print("end");

        System.out.println(" ");
        //This is to print the linked-list in reverse order
        // while(last != null){
        //     System.out.print(last.value+"->");
        //     last =last.prev;
        // }
        // System.out.println("Start");

    }

    public static void main(String []args){
        DLL List = new DLL();
        List.insert(10);
        List.insert(20);
        List.insert(30);
        List.insert(150);
        List.insertFirst(12);
        List.insertFirst(11);
        List.display();
        List.insertLast(35);
        List.display();
        List.insertAtindex(26, 3);
        List.display();
        System.out.println();
        List.findpre(30);
        
    }
    
    
}
