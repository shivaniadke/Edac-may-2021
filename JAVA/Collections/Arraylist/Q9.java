
 //Write a Java program to copy one array list into another.

import java.util.*;
class Q9 {
    public static void main(String[] args) {
		ArrayList <String>list = new ArrayList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");
        //ArrayList <String>list2 = new ArrayList<String>();
        ArrayList <String>list2 = list;
        System.out.println(list2);
        ArrayList <String>list3 = list2;
        System.out.println(list3);
}
}