/*
// *linked list has two methods
    1.Insertion
        a.At beginning
        b.At.end
        c.At any position
    2.Deletion

*Advantages over arrays 
    1) Dynamic size 
    2) Ease of insertion/deletion
* Q. Time complexity to count the number of elements in the linked list?
ANS:To count the number of elements, 
    you have to traverse through the entire list, hence complexity is O(n)

*/





public class LinkedList1 {
    Node head;  //creating Node which is head of the list

   static class Node{
        int data;
        Node next;

        Node(int data){   //creating constructor
            this.data=data;
            next=null;
        }
    }
/////////////----------AT Beginning-----------/////////////
    void AtBeginning(int data){
        Node newNode=new Node(data);  //Allocate or we creat node
        newNode.next=head;  
        head = newNode;// we move the head to point to new node
    }

////////////----------At Middle---------////////////////
    void AtMiddle(Node previous_Node ,int new_Data){
        if(previous_Node ==null){
            System.out.println("We cannot add ");
            return;
        }
            Node new_Node=new Node( new_Data);
            new_Node.next = previous_Node.next;
            previous_Node.next =new_Node;
        }

////////////--------At End----------//////////////
        void AtEnd(int data){
            if(head==null){
                head = new Node(data);
                return;
            }
            Node new_Node= new Node(data);
            new_Node.next=null;
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new_Node;
        }
//////////------------Display Method---------/////////////
    void Display(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data  +" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList1 obj = new LinkedList1();
        obj.head=new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        obj.head.next=second;
        second.next=third;
        third.next=fourth;

        obj.AtBeginning(80);
        obj.AtMiddle(second, 65);
        obj.AtEnd(75);
        obj.Display();


}
}
