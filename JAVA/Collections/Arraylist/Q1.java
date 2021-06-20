
// Write a Java program to create a new array list, add some colors (string) and print out the collection

import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Black");
		list.add("yellow");
		list.add("Red");
		list.add("Blue");
		list.add("White");
	for(int i=0; i<list.size(); i++)
	{
		System.out.println(list.get(i));
	}
			
	}

}

/*
Black
yellow
Red
Blue
White*/