// Write a Java program to increase the size of an array list

import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("SHIVANI");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println(list);
        list.ensureCapacity(20);
    
}
}
