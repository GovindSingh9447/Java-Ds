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

          if(list.head==null){
              list.head=new_node;
          }
          else{
              
            Node last=list.head;
            while(last.next !=null){
                last=last.next;
            }

            last.next=new_node;
          }

        return list;
        
    }

    public static void printlist(LinkedList2 list){
        
        Node curr_data= list.head;

        System.out.println("LinkedList : ");

        while(curr_data != null){

            System.out.print(curr_data.data);

            curr_data=curr_data.next;
        }

    }

    public static void main(String args[]){

        LinkedList2 list=new LinkedList2();

        list=insert(list, 15);
        list=insert(list, 45);
        list=insert(list, 28);
        list=insert(list, 90);
        list=insert(list, 55);
        list=insert(list, 11);
        list=insert(list, 17);

        printlist(list);
    }
}