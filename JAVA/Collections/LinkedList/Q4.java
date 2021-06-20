package LinkedList;
//. Write a Java program to iterate a linked list in reverse order.

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        LinkedList <Integer>list = new LinkedList<Integer>();
    	list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
	System.out.println(list);

    Iterator<Integer> itr=list.descendingIterator();  
    while(itr.hasNext()){  
     System.out.println(itr.next());
    }
}
}
