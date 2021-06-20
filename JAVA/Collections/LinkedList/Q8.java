package LinkedList;
import java.util.*;
// Write a Java program to insert the specified element at the end of a linked list.

public class Q8 {
    public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();   

list.add("first");
list.add("second");
list.add("third");
list.add("fourth");
System.out.println(list);
list.addLast("LAST");
System.out.println(list);


}
}
    