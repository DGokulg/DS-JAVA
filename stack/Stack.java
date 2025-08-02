class StackNode{
    int data;
    StackNode next;
    public StackNode(int data){
        this.data = data;
        next = null;
    }

}

class Methods{
    static StackNode top = null;

    public static void push(int data){
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    public static void pop(){
        if(top==null) return;
        top =top.next;
    }
    public static void display(){
        if(top == null) return;
        StackNode temp = top;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void peak(){
        if(top == null) return;
        System.out.println("Top : " + top.data);
    }
}

public class Stack extends Methods{
    public static void main(String[] args)  {
        push(4);
        push(3);
        push(3);
        push(3);
        

        pop();
        pop();
        

        display();
        peak();


    }
}
