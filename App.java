import java.util.LinkedList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arry= {1,5,6,7};
//		int arry2[]=new int[10];
//		
//		for(int i=0; i<arry.length;i++)
//		{
//			System.out.println(arry[i]);
//		}

		
//		Node h3=new Node(1);
//		Node h2=new Node(2,h3);
//		Node h1=new Node(3,h2);
//		Node mov=h1;
//		
//		while(mov!=null) {
//			System.out.print(h1.data);
//			mov=mov.nextNode;
//		}
		
		
		LinkedList<Integer> p= new LinkedList<>();
        p.add(1);
        p.add(3);
        p.add(45);
        p.add(4);

        for(int i=0;i<p.size();i++)
        {
            System.out.println(p.get(i));
        }
		
	}
	
	class Node{
		int data;
		Node nextNode;
		
		
		public Node(int data) {
			this.data=data;
			this.nextNode=null;
		}
		
		public Node(int data, Node nextNode) {
			this.data=data;
			this.nextNode=nextNode;
		}
	}

}
