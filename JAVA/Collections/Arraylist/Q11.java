//11. Write a Java program to reverse elements in an array list. 

import java.util.*;

public class Q11 {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");   //3
		System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

       // [Black, White, Green, Blue]
//[Blue, Green, White, Black]
}
}
