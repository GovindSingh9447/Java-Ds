//creation of Linked List

class LinkedList{

    //head of list
    Node head;

    //Node of Linked List

    class Node{
        int data;
        Node next;

        //constructor to create a new node
        //Next is by default init as null
        Node(int d)
        {
            data=d;
        }
    }
}