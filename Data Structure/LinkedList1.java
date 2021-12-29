

public class LinkedList1{

    Node head;

    //inner class
    static class Node{                     //static bcz main() can acces it
 
        int data;
        Node next;

        //constructor

        Node(int d){
            data = d;
            next=null;

        }

    }

    //method to insert new node

    public static LinkedList1 insert( LinkedList1 list , int data){

      //create new node 
        Node new_node = new Node(data);      //given data
        new_node.next = null;


        //if linked list is empty, then make new node

        if(list.head==null){
            list.head=new_node;
        }
        else
        {
            
        }


        return list;

    }
    
}
