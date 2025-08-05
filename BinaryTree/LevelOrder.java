
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data =data;
        left = null;
        right = null;
    }

    
}

class Methods{
    static Node root = null;
    public static void insert(int data){
        if(root == null){
            Node newNode = new Node(data);
            root = newNode;
            return;
        }

        Node newNode = new Node(data);

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(true){
            Node temp = queue.remove();
            if(temp.left!= null && temp.right!=null){
                queue.add(temp.left);
                queue.add(temp.right);
            }
            else{
                if(temp.left == null){
                    temp.left = newNode;
                    break;
                }
                else{
                    temp.right = newNode;
                    break;
                }
            }
        }
    }

    

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}


public class LevelOrder extends Methods{
    public static void main(String[] args) {
        insert(0);
        insert(1);
        insert(2);
        insert(3);
        insert(4);

        inorder(root);
    }
}
