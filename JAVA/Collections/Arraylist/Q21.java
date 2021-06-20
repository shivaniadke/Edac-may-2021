//Write a Java program to replace the second element of an ArrayList with the specified element. 


import java.util.*;
public class Q21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("SHIVANI");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println(list);
        list.set(1, "adke");
        System.out.println(list);
    }}
