import javax.naming.directory.SearchControls;

public class BinarySerchTree {
       static Node root=null;
        static class Node{
            int data;
            Node left,right;
            Node(int data){
            this.data=data;
            Node left,right=null;
        }
    }
    Node insert(Node root,int key){
       
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.data){
            root.left =insert(root.left,key);
        }
        else if(key>root.data){
            root.right=insert(root.right,key);
            
        }
        return root;//returnes the value of root to inOrder method for printing purpose
    }
        void insertData(int key){
        root=insert(root ,key);  //recurssion is happening here 
        }

        void inOrder(){
        inOrder(root);
    }
    
    void inOrder(Node root)
    {
        if(root!=null)
        {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    ///////////////////  serching//////////////////////////

  static  boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(key<root.data){
            return search(root.left,key);

        }
        else
        {
            return search(root.right,key);
        }
    
    }
    public static void main(String[] args) {
        BinarySerchTree obj=new BinarySerchTree();
        
        obj.insertData(50);
        obj.insertData(78);
        obj.insertData(13);
        obj.insertData(25);
        obj.insertData(65);
        obj.insertData(9);
        obj.insertData(85);
        obj.inOrder();
        int key=78;
        if (search( root ,key)){
            System.out.println("found");
        }
        else{
            System.out.println("Not Found");
        }

        
    
    
    }

}

