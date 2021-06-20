//Write a Java program to extract a portion of an array list.

import java.util.*;
public class Q12 {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");   //3
        list.add("Pink");   //4
        list.add("White");  //5
		System.out.println(list);
        List<String> list2 = list.subList(2 , 5);
        System.out.println(list2);
        
    
}
}

