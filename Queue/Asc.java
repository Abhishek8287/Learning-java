import java.util.*;
public class prioqueue{
    int count;
    public static class node{
        int data;
        node next;
        node(int k){
            data=k;
            next=null;
        }
    }
    node head;
    public static prioqueue insert(prioqueue q,int k){
        node jack=new node(k);
        node curr=q.head;
        if(q.head==null){
            q.head=jack;
            return q;
        }
        else if(curr.data>=k){
            jack.next=q.head;
            q.head=jack;
            return q;
        }
        else{
            node prev=null;
             curr=q.head;
            while(curr != null){
                if((prev != null ) &&   (prev.data <= k && curr.data>k) ){
                    prev.next=jack;
                    jack.next=curr;
                    return q;
                }
                else{
                    prev=curr;
                    curr=curr.next;
                }
            }
            if(curr==null){
                prev.next=jack;
                
            }
        
        return q;
    }}
    public static void transversal(prioqueue q){
        if(q.head==null){
            System.out.println("empty");
        }
        
        else{
            System.out.println("queue has = >");
            node curr = q.head;
            while(curr!=null){
                System.out.println(curr.data);
                curr=curr.next;
            }
        }
    }
    public static prioqueue deletion(prioqueue q){
        node curr=q.head;
        if(q.head==null){
            return q;
        }
        
        else{
            q.head=curr.next;
            return q;
        }
    }
    public static void main(String[] args){
        prioqueue q=new prioqueue();
        q.insert(q,4);
        q.insert(q,6);
        //q.deletion(q);
        q.insert(q,5);
        q.insert(q,19);
        q.insert(q,5);
        q.transversal(q);
    }
}