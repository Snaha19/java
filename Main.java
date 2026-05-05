import java.util.Scanner;
import java.util.*;

class linklist {

    private Node head;
    private Node tail;
    private int size;


    public linklist(){
        this.size=0;
    }

    public void insert_at_first(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if (tail== null) {
            tail=head;
        }
        size+=1;

    }

    // public void insert_at_end(int val){ //constant time
        
        
    //     if (tail==null){
    //         insert_at_first(val);
    //         return;
    //     }
    //     Node node=new Node(val);
    //     tail.next=node;
    //     tail=node;

    //     size+=1;

    // }
    public void insert_at_end(int val){
           Node node= new Node(val);
           Node temp=head;
           
           if (head==null){
            insert_at_first(val);
            return;
           }

           while (temp.next != null){
             temp=temp.next;
           }
      
           temp.next=node;
           
           size+=1;

    }

    public void insert_at_specific_index(int val,int index){
        if (index==0){
            insert_at_first(val);
            return;
        }
        if(index==size){
            insert_at_end(val);
            return;
        }
         
        //method 1
        Node node=new Node(val);
        Node temp=head;
        Node prev=temp;
        
        if (index >size){
            System.out.println("invalid index");
            return;
        }
        for(int i=1;i<index;i++){
            prev=temp;
            temp=temp.next;
        }

        System.out.println(prev.value);
        System.out.println(temp.value);
        System.out.println((temp.next).value);

        node.next=temp.next;
        temp.next=node;
        size+=1;

        //method 2
        
        // Node temp=head;
        // for (int i=1;i<index;i++){
        //     temp=temp.next;
        // }
        // Node node =new Node(val,temp.next);
        // temp.next=node;
        // size+=1;

    }

    public int delete_first(){
       
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=head;
        }
        size--;
        return val;

    }
    
    // public int delete_last(){
    //     if(size <=1){
    //         return delete_first()

    //     }
    //     Node secondlast=get(size-2);
    //     int val=tail.value;
    //     tail=secondlast;
    //     tail.next=null;

    //     return val;
    // }

    public int delete_last(){
        Node temp=head;
        Node prev=temp;
        while (temp.next!=null) {
            prev=temp;
            temp=temp.next;
            
        }
        int val=temp.value;
        prev.next=null;
        
        return val;


    }

    public int delete_specific_index(int index){
        if (index==0){
            return delete_first();
        }
        if (index==size-1){
            return delete_last();

        }
        Node prev=get(index-1);
        int val=prev.next.value;

        prev.next=prev.next.next;
        return val;
    }


    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;

    }
    public Node get(int index){
        Node node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }


    public void display(){
        Node temp=head;
        
        while (temp != null) {
            System.out.print(temp.value+" -> ");
            
            temp=temp.next;
            
        }
        System.out.println("end");
    }


    class Node {
        private int value;
        private Node next;

    public Node (int value){
        this.value=value;
    }
    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }

   }
}


public class Main{
    public static void main(String[] args) {
        linklist list=new linklist();
        list.insert_at_end(18);
        list.insert_at_first(12);
        list.insert_at_first(8);
        list.insert_at_first(9);
        list.insert_at_first(5);
        list.insert_at_first(3);

        //list.insert_at_end(50);
        list.insert_at_specific_index(17, 3);
        System.out.println("deleted item is : "+list.delete_first());
        System.out.println("last deleted item is : "+list.delete_last());
        System.out.println("delete position  item :"+list.delete_specific_index(2));
        list.display();
    }
}