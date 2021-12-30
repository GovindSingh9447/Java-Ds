import java.util.function.ObjDoubleConsumer;

public class LL {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            this.data=d;
            this.next=null;
        }

    }

    //ADD NODE 

    // FIRST POSITION
    public void addFirst(int data){

        Node newNode=new Node(data);


        if(head==null){

            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }


    //LAST POSITION
    public void addLast(int data){

        Node newNode =new Node(data);

        if(head==null)
        {
          head=newNode;
          return;  
        }

        Node currNode=head;

        while(currNode!=null){

            currNode=currNode.next;

        }
        currNode.next=newNode;
    }

    //PrintList

    public void printList(){
        if(head==null){
            
        }
    }
    
    public static void main(String args[]){

        LL list =new LL();
        list.addFirst(10);

        list.addLast(20);
        list.addFirst(12);;


    }
}
