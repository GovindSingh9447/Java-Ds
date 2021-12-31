class Stack {

    static final int MAX=1000;
    int top;
    int a[]=new int[MAX];



    boolean isEmpty()
    {
        return(top<0);
    }

    Stack()
    {
        top=-1;
    }

    boolean push(int x){


       if(top>=(MAX-1)){


        System.out.println("Stack OverFlow");
        return false;

       } 
       else{
           a[++top]=x;
           System.out.println(x +"push into stack");
           return true;
       }
    }

    int pop()
    {
        if(top<0){
           System.out.println("Stack Underflow");
            return 0;

        }
        else{
            int x=a[top--];
            return x;
        }
    }

    int peek()
    {
        if(top<0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int x=a[top];
            return x;
        }
    }
    void print(){

        for(int i=top; i>-1;i--){
            System.out.println(" "+a[i]);
        }

    }

}
class Main{

    public void main (String args[])
    {
        Stack s= new Stack();
        s.push(100);
        s.push(12);
        s.push(180);

        System.out.println(s.pop() +" poped");
        System.out.println();

        
    }
}
