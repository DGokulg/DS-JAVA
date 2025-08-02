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
        if(head == null && tail==null){
            head = newnNode;
            tail = newnNode;
        }
        head.next = tail;
        tail.prev = head;
        head = newnNode;

    }
}

public class Doubly_Linked_List extends DubMethods{
    public static void main(String[] args) {
        insertAtBeg_DUB(1);
        insertAtBeg_DUB(2);
        insertAtBeg_DUB(3);
        insertAtBeg_DUB(4);
        DUB_Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
