

 class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }

}   
class Methods{
    static Node head = null;
    public static void insertAtBeg(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;


    }

    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        head = temp;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        // System.out.println(head.data);
    }

    public static void insertAtPos(int pos , int data){
        Node newNode = new Node(data);
        if(pos==0){
            insertAtBeg(data);
            return;
        }
        Node temp = head;
        while(temp != null && pos-1>0){
            temp = temp.next;
            pos--;
        }
        if(temp == null){
            insertAtEnd(data);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void deleteAtBeg(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    public static void deleteAtEnd(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        head = temp;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next = null;
    }

    public static void deleteAtPos(int pos){
        if(pos == 0){
            deleteAtBeg();
            return;
        }
        Node temp = head;
        head = temp;

        while(temp.next.next!=null && pos-1>0){
            temp = temp.next;
            pos--;
        }
        if(temp.next.next==null){
            deleteAtEnd();
        }
        temp.next = temp.next.next;
    }
    
}
public class Singly_Linked_List extends Methods  {

    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            insertAtBeg(i);
        }
       

        insertAtPos(2, 5);
        deleteAtBeg();
        deleteAtEnd();
        deleteAtPos(5);
        Node temp1 = head;
        while(temp1!=null){
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
    }
}
