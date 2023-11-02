class Node{
    Node left = null;
    int data = data;
    Node right = null;

    public Node(Node left, int data, Node right) {
        this.left = left;
        this.data = data;
        this.right = right;
    }

    public boolean search(Node root, int val){
        if(root==null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data<val){
            return search(root.right, val);
        }
        else{
            return search(root, val)
        }
    }
    
}
public class BinarySearchTree{
    Node root;
    public Node insertNode(Node root, int val){
        if(root==null){
            return new Node(val);
        }
        else if(root.data < val){
            root.right  = insertNode(root.right, val);
        }
        else{
            root.left = insertNode(root.left, val);
        }
        return root;
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);

        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = bst.insertNode(bst.root, 100);
        bst.root = bst.insertNode(bst.root, 50);
        bst.root = bst.insertNode(bst.root, 10);
        bst.root = bst.insertNode(bst.root, 60);
        bst.root = bst.insertNode(bst.root, 250);
        bst.root = bst.insertNode(bst.root, 150);
        bst.root = bst.insertNode(bst.root, 300);

        bst.inorder(bst.root);

        // bst.inorder(bst.root);
        System.out.println(bst.search(bst.root, 600));
    }
    
    
}