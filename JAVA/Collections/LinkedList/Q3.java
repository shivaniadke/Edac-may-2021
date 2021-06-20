package LinkedList;
//Write a Java program to iterate through all elements in a linked list starting
//at the specified position.

    import java.util.*;
    public class Q3 {
            public static void main(String[] args) {
                LinkedList <String>list = new LinkedList<String>();
                list.add("first");
                list.add("second");
                list.add("third");
                list.add("fourth");
                list.add("fifth");
                for(int i=1; i<list.size(); i++)
                {
                    System.out.println(list.get(i));
                }
                        
                }
        
    
        }
