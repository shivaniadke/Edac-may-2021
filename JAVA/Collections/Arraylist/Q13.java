//Write a Java program to compare two array lists. 

import java.util.*;
public class Q13 {
    public static void main(String[] args) {
            ArrayList <String>list = new ArrayList<String>();
            list.add("Black");  //0
            list.add("White");  //1
            list.add("Green");  //2
            list.add("Blue");   //3
            list.add("Pink");   //4
            list.add("White");  //5
            System.out.println(list);
            ArrayList <String>list2 = new ArrayList<String>();
            list2.add("Black");  //0
            list2.add("White");  //1
            list2.add("Green");  //2
            list2.add("Blue");   //3
            list2.add("lilac");   //4
            list2.add("White");  //5
            System.out.println(list2);
            if(list.equals(list2) == true)
            { 
                System.out.println("both list are same");
            }
else
{
    System.out.println("list are not same");
}


    }
}
