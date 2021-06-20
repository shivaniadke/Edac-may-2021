//Write a Java program to clone an array list to another array list.

import java.util.*;
//16. Write a Java program to clone an array list to another array list.
public class Q16 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("SHIVANI");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println("Original ArrayList :" + list); //Printing original ArrayList
        //Creating second ArrayList
        ArrayList list2 = new ArrayList();
        list.add("lilac");   
        list.add("White");  
        //Cloning first ArrayList into Second
        list2 = (ArrayList)list.clone();
        System.out.println("Clonned ArrayList :" + list2); //Printing Second ArrayList
        }
}

