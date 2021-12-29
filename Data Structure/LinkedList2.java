
 //deletions of node

public class LinkedList2{

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

    public static LinkedList2 insert( LinkedList2 list , int data){

      //create new node 
        Node new_node = new Node(data);      //given data
        new_node.next = null;


        //if linked list is empty, then make new node

        if(list.head==null){
            list.head=new_node;
        }

        //else traverse till last node
        //and insert new node there
        else
        {
            Node last =list.head;

            while(last.next!=null){

                last = last.next;

            }

            //Insert new node at last

            last.next=new_node;
        }

        // return the list by head
        return list;

    }

    //method to print linklist
    public static void printList(LinkedList2 list)
    {
        Node currNode= list.head;
        System.out.print("Linkedlist : ");


        //Traverse throught the linkedList

        while(currNode != null)
        {

            //print the data at current node
            System.out.println(currNode.data + " ");

            // go to next node

            currNode =currNode.next;
        }
    }

    //driver code
    public static void main(String args[]){

        //start with empty list

        LinkedList2 list= new LinkedList2();

        //Insert the values

        list=insert(list, 1);
        list=insert(list, 2);
        list=insert(list, 3);
        list=insert(list, 4);
        list=insert(list, 5);


        //print the linkedlist
        printList(list);


    }
    
}
