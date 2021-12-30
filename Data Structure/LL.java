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
            
        }
    }
    
    public static void main(String args[]){

        LL list =new LL();


    }
}
