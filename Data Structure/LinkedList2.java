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

            System.out.print(curr_data.data +" ");

            curr_data=curr_data.next;
        }

        System.out.println(" ");

    }

                                           // DELETION
    public static LinkedList2 deleteBYKey(LinkedList2 list, int key){

        //Store head node
        Node currNode=list.head, pre=null;


        //CASE 1
        //If head node itself hold key to deleted

        if(currNode != null && currNode.data == key){

            //change head

            list.head=currNode.next;

            //Display the msg 
            System.out.println(key +"Found and deleted");

            return list;
        }


        //CASE 2
        //If the key is somewhere other then head


        //search for the key to delete
        //keep trak of previous node
        // need to change currentNode.next

        if(currNode !=null && currNode.data != key){

            //if current node dont contain key move to next
            pre=currNode;
            currNode=currNode.next;


            if(currNode != null){

                pre.next=currNode.next;

                System.out.println(key +"Found and deleted");

            
            }

            if(currNode == null){

                System.out.println(key +"Not Found");
            }
            
            
        }


        return list;
         
        
        
                
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

        deleteBYKey(list, 15);

        printlist(list);

    }
}