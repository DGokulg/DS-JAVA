// Java Program to Implement AVL Tree

class Node {
    int data, height,bal;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
        height = 1;
    }
}

class Methods{
    static Node root = null;

    public static int setHeight(Node root){
        if(root.left == null && root.right == null) return 0;
        if(root.left != null && root.right == null) return root.left.height;
        if(root.left == null && root.right != null) return root.right.height;
        return root.left.height >root.right.height ? root.left.height : root.right.height;
    }

    public static int getBalance(Node root){
        if(root.left == null && root.right == null) return 0;
        if(root.left != null && root.right == null) return root.left.height;
        if(root.left == null && root.right != null) return 0 - root.right.height;
        return root.left.height - root.right.height;
    }

    public static Node leftRotate(Node root){
        Node rightchild = root.right;
        Node leftChildOfRight = rightchild.left;

        rightchild.left = root;
        root.right = leftChildOfRight;

        root.height = setHeight(root)+1;
        root.bal = getBalance(root);
        
        rightchild.height = setHeight(rightchild)+1;
        rightchild.bal = getBalance(rightchild);

        return rightchild;
    }



    public static Node rightRotate(Node root){
        Node leftchild = root.left;
        Node rightChildofLeft = leftchild.right;

        leftchild.right = root;
        root.left = rightChildofLeft;

        root.height = setHeight(root)+1;
        root.bal = getBalance(root);
        
        leftchild.height = setHeight(leftchild)+1;
        leftchild.bal = getBalance(leftchild);

        return leftchild;
    }
    

    public static Node insert(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data <root.data){
            root.left = insert(root.left,data);
        }
        else if(data >root.data){
            root.right = insert(root.right,data);
        }
        else{
            return root;
        }

        root.height = setHeight(root) + 1;
        
        int bal =  getBalance(root);
        root.bal = bal;

        if(bal > 1 && data < root.left.data){
            root = rightRotate(root);
        }
        if(bal <-1 && data > root.right.data){
            root = leftRotate(root);
        }
        if(bal < -1 && data < root.right.data ){
            root.right = rightRotate(root.right);
            root = leftRotate(root);
        }
        if(bal > 1 && data > root.left.data){
            root.left = leftRotate(root.left);
            root = rightRotate(root);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        System.out.print("    Node:" + root.data +"\n"+"Height: "+ root.height+" "+"Bal: "+root.bal +"\n");
        System.out.println();
        inorder(root.left);
        inorder(root.right);

    }

}

class Avl extends Methods{
    public static void main(String[] args) {
        int[] values = {50, 30, 70, 65, 89, 100, 120 , 400};
        for (int v : values) {
            root = insert(root, v);
}
        
        inorder(root);
    }
}