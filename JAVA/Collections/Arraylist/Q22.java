//Write a Java program to print all the elements of an ArrayList using the position of the elements.


import java.util.*;
public class Q22 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("SHIVANI");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println(list);
        for(int i=0;i<list.size();i++)
        {
        System.out.println(list.get(i));
        }
        for(int i=2;i<list.size();i++)
        {
        System.out.println(list.get(i));
        }

    }}