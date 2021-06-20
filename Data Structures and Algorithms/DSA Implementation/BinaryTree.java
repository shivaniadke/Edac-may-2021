public class BinaryTree {
    static Node root;

    static class Node{
    int data;
    Node left;
    Node right;
    Node (int data){
        this.data=data;
        left=right=null;
    }
   void InOrder(Node root){
        if(root!=null)
        {
            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }
    }
    void PreOrder(Node root){
        if(root!=null)
        {
            System.out.print(root.data + " ");
            InOrder(root.left);
            InOrder(root.right);
        }
    }

    void PostOrder(Node root){
        if(root!=null)
        {
            InOrder(root.left);
            InOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        {
           Node root=new Node(10);
           root.left=new Node(20);
           root.right=new Node(30);
           root.left.left=new Node(40);
           root.left.right=new Node(50);
           root.right.right=new Node(60);
    
           root.InOrder(root);
           System.out.println();
           root.PreOrder(root);
           System.out.println();
           root.PostOrder(root);
           
        }
    }
    }
}

