class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }

}

class Methods{
    static Node head,tail =null;
    public static void inserAtBeg(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            head.next = tail;
            tail.next = head;
            return;
        }
        newNode.next = head;
        head = newNode;
        tail.next = head;

    }

    public static void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            inserAtBeg(data);
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public static void insertAtPos(int pos, int data){
        Node newNode = new Node(data);
        if(pos == 0){
            inserAtBeg(data);
            return;
        }
        Node temp = head;
        do { 
            temp = temp.next;
            pos--;
        } while (temp.next!=head && pos-1 >0);

        if(temp.next == head){
            insertAtEnd(data);
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void display(){
        if(head == null) return;
        Node temp = head;

        do { 
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp!=head);
    }

    public static void deleteAtBeg(){
        if(head == null) return;

        if(head == tail){
            head = null;
            tail = null;
            return;
        }

    }
}

public class Circular_Linked_List extends Methods {
    public static void main(String[] args) {
        inserAtBeg(0);
        inserAtBeg(1);
        insertAtEnd(90);

        insertAtPos(1, 5);

        display();

    }
}
