// Write a Java program to trim the capacity of an array list the current list size.

import java.util.*;
public class Q19 
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("SHIVANI");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println(list);
        list.trimToSize();
        System.out.println(list);
}
}

