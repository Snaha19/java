import java.util.*;

public class doubly_linklist {
  
     private Node head;
    private Node tail;
    private int size;


    public doubly_linklist(){
        this.size=0;
    }

    public void insert_first(int val){
        Node node= new Node(val);

        node.next=head;
        node.prev=null;
        if (head !=null){
        head.prev=node;
        }
        head=node;
        size++;

    }



    public void insert_last(int val){
      Node node=new Node(val);
      Node last=head;

      node.next=null;

      if (head== null){
        node.prev=null;
        head=node;
        return;
      }

      while(last.next!=null){
        last=last.next;
      }

      last.next=node;
      node.prev=last;

      size++;
    }



    public void insert_at_specific_index(int val,int position){
      if(position ==0){
         insert_first(val);
         return;
        
      }
      if (position == size-1){
        insert_last(val);
        return;

      }
       
      Node temp=head;
      for (int i=1;i<position;i++){
        temp=temp.next;
      }
      Node node=new Node(val,temp.next,temp.prev);

      temp.next=node;
     
      size++;
    }

   public void display(){
     Node temp=head;
     Node last=null;
     while(temp != null){
        last=temp;
        System.out.print(temp.val+" ->  ");
        temp=temp.next;

     }
     System.out.println("end");

     System.out.println("Reverse printing");
     while(last !=null){
      System.out.print(last.val+" -> ");
      last=last.prev;
     }

     System.out.println("start");


   }



  private class Node{
    int val;
    Node next;
    Node prev;
  
  

  public Node(int val){
    this.val=val;

  }

  public Node(int val,Node prev,Node next){
    this.val=val;
    this.next=next;
    this.prev=prev;
  }

}



  public Node getHead() {
    return head;
  }

  public void setHead(Node head) {
    this.head = head;
  }

  public Node getTail() {
    return tail;
  }

  public void setTail(Node tail) {
    this.tail = tail;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
 
}

public class Main2{
    public static void main(String[] args) {
        doubly_linklist dl=new doubly_linklist();
        dl.insert_first(8);
        dl.insert_first(3);
        dl.insert_first(2);
        dl.display();
        dl.insert_first(13);
        dl.insert_last(99);
        dl.insert_at_specific_index(999, 3);
        dl.display();
    }
}
