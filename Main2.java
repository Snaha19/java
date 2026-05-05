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
        size++;
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
      if (position == size){
        insert_last(val);
        return;

      }
       
      Node temp=head;
      for (int i=1;i<position;i++){
        temp=temp.next;
      }
      Node node=new Node(val,temp.next,temp.prev);

     
      node.prev=temp;
      node.next=temp.next;
      temp.next.prev=node;
      temp.next=node;
     
      size++;
    }
   public void insert_at_specific_value(int after,int val){
    Node p=find(after);

    if (p==null){
      System.out.println("does not exist");
      return;
    }
    Node node=new Node(val);
    node.next=p.next;
    p.next=node;
    node.prev=p;
     if(node.next!=null)
       node.next.prev=node;



   }
   public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;

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
        dl.insert_at_specific_value(999, 55);
        dl.display();
    }
}
