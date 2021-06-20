package LinkedList;
// Write a Java program to insert elements into the linked list at the first and
// last position.
import java.util.*;
public class Q6 {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> list = new LinkedList<String>();   

list.add("first");
list.add("second");
list.add("third");
list.add("fourth");
System.out.println(list);
list.addFirst("FIRST");
list.addLast("LAST");
System.out.println(list);
}
}

//[fifth, first, second, sixth, third, fourth]
//[FIRST, fifth, first, second, sixth, third, fourth, LAST]
//
