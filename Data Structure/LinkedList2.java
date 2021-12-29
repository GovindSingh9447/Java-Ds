//deletion

public class LinkedList2{

    Node head;

    public static class Node{

        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;

        }
    }

    public static LinkedList2 insert(LinkedList2 list , int data){

          Node new_node=new Node(data);
          new_node.next=null;

        return list;
        
    }
}