import java.util.*;

public class LL{

    private Node head ;
    private Node tail;
    private int size ;
    LL(){
        this.size = 0 ;
    }
    public class Node{
        private int value ;
        private Node next ;

        Node(int value){
            this.value = value;
        }

        Node(int value , Node next){
            this.value = value;
            this.next = next ;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head ;
        head = node ;

        if(tail == null){
            tail = head;
        }

        size = size + 1;

    }
    //inserting at end without using tail
    public void insertEnd(int value){
        Node temp = head;
        Node node = new Node(value);
        if(temp == null){
            head = node;
            return ;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = node ;
            node.next = null ;
            tail = node;
            size++;
        }
    }

    //Inserting using tail 
    public void insertTail(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }
    //For displaying the linked list
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("end");
    }

    //Inserting at a particular index
    public void insertAtIndex(int index , int value){
        
        if(index == 0){
            insertFirst(value);
            return ;
        }

        if(index == size){
            insertEnd(value);
            return;
        }
        //5->4->3->2->10->0
        Node temp = head ;
        for(int i = 1 ; i < index ; i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
       
        temp.next=node;
    
        size++;
        
    }

        //deleting firstnode
    public int deleteFirst(){
        int value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return value;
    }

    //deleting last node
    public int deleteAtLast(){
        if(size <= 1){
            int res = deleteFirst();
            return res;
        }
        Node second_Last = get(size - 2);
        int value = tail.value;
        tail = second_Last;
        second_Last.next = null;
        return value;

    }
    //delete at any index
    public int deleteIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteAtLast();
        }
        Node prev = get(index-1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;
    }
    //function to get the node
    public Node get(int index){
        Node node = head;
        for(int i = 0 ; i< index ; i++){
            node=node.next;
        }

        return node;
    }
    public static void main(String []args){
        LL List = new LL();
        List.insertFirst(8);
        List.insertFirst(5);
        List.insertFirst(6);
        List.insertFirst(7);
        List.insertEnd(15);
        
        List.insertAtIndex(2, 100);

        List.display();
        System.out.println(List.deleteFirst());
        List.display();
        System.out.println(List.deleteAtLast());
        List.display();
        System.out.println(List.deleteIndex(1));
        List.display();
    }


}