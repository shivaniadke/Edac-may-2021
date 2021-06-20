package LinkedList;

import java.util.*;
public class Q1 {
   

    public static void main(String[] args) {
		LinkedList <String>list = new LinkedList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");//3
        System.out.println(list);
        list.addLast("Last");
        System.out.println(list);
}
}

