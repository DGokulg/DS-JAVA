class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left =  null;
        right = null;
    }
}

class Methods{
    static Node root = null;
    public static Node insert(Node root, int data){
        if(root == null){
            root =  new Node(data);
            return root;
        }
        if(data < root.data) root.left  = insert(root.left,data);
        if(data > root.data) root.right = insert(root.right,data);
        
        return root;
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static Node delete(Node root, int data){
        if(root == null) return null;
        
        
        if(data < root.data) root.left  = delete(root.left,data);
        else if(data > root.data) root.right = delete(root.right,data);
        else{
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            root.data = min(root.right);
            root.right = delete(root.right , root.data);
        }
        return root;
    }
    public static int min(Node root){
        int min = root.data;
        while(root.left!=null){
            min = root.left.data;
            root=root.left;
        }
        return min;
    }
}

class Bst extends Methods{
    public static void main(String[] args) {
        root = insert(root,26);
        root = insert(root,22);
        root = insert(root,120);
        root = insert(root,7);
        root = insert(root,6);
        root = insert(root,11);
        root = insert(root,70);

        root = delete(root, 22);

        inorder(root);
    }
}