// Write a Java program to test if an array list is empty or not.

import java.util.*;
public class Q18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("SHIVANI");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println(list);
        boolean b=list.isEmpty();
        if(b==true)
        {
            System.out.println("List is empty");
        }
else{
        System.out.println("list is not empty");

    }
    }
}

