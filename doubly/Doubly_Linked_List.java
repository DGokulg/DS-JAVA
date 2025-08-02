class DUB_Node{
    DUB_Node prev;
    int data;
    DUB_Node next;

    public DUB_Node(int data){
        prev = null;
        this.data = data;
        next = null;
    }
}

class DubMethods{
    static DUB_Node head,tail = null;
    public static void insertAtBeg_DUB(int data){
        DUB_Node newnNode = new DUB_Node(data);
        if(head == null ){
            head = newnNode;
            tail = newnNode;
            return;
        }
        newnNode.next = head;
        head.prev = newnNode;
        head = newnNode;

    }

    public static void insertAtEnd_DUB(int data){
        DUB_Node newNode = new DUB_Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public static void insertAtPos(int pos,int data){
        if(pos==0){
            insertAtBeg_DUB(data);
            return;
        }
        DUB_Node temp = head;
        while(temp.next!=null && pos-1>0){
            temp = temp.next;
            pos--;
        }
        
        if(temp.next == null){
            insertAtEnd_DUB(data);
            return;
        }
        // System.out.println(temp.data);
        DUB_Node newNode = new DUB_Node(data);
        temp.next.prev = newNode;
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        // newNode.prev = temp;
        // temp.next.prev = newNode;
        // temp.next = newNode;
        
    }

    public static void deleteAtBeg(){
        if(head == null){
            return;
        }
        head=head.next;
        head.prev =null;
    }

    public static void deleteAtEnd(){
        if(head == null){
            return;
        }
        if(tail.prev == null){
            head = null;
            tail = null;
            return;
        }
        tail.prev.next = null;
        tail = tail.prev.next;
        
    }
    
    public static void DeleteAtPos(int pos){
        if(pos == 0){
            deleteAtBeg();
            return;
        }
        DUB_Node temp = head;
        while(temp.next !=null && pos-1 >0){
            temp = temp.next;
            pos--;
        }
        if(temp.next.next == null){
            deleteAtEnd();
            return;
        }
        // System.out.println(temp.data);
        temp.next.next.prev = temp;
        temp.next = temp.next.next;


    }

    public static void display(){
        DUB_Node temp = head;
        if(temp == null){
            System.out.println("empty");
            return;
        }  
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class Doubly_Linked_List extends DubMethods{
    public static void main(String[] args) {
        insertAtBeg_DUB(1);
        insertAtBeg_DUB(2);
        insertAtBeg_DUB(3);
        insertAtBeg_DUB(4);
        insertAtEnd_DUB(7);

        
        display();
        System.out.println();
        // deleteAtBeg();
        // deleteAtEnd();
        // // insertAtPos(0, 90);
        // System.out.println();
        // // display();
        // display();

        // System.out.println();
        DeleteAtPos(0);
        display();
       
    }
}
