package LinkedList;

// Write a Java program to iterate through all elements in a linked list.
    import java.util.*;
public class Q2 {
        public static void main(String[] args) {
            LinkedList <String>list = new LinkedList<String>();
            list.add("Black");  //0
            list.add("White");  //1
            list.add("Green");  //2
            list.add("Blue");//3
            System.out.println(list);
            Iterator<String> itr=list.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  

    }
    }
     
}