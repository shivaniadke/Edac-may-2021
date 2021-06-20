

//8 Write a Java program to sort an element in an array list. 

import java.util.*;
public class Q8 {
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
	System.out.println(list);
    Collections.sort(list);
    System.out.println(list);  //12345
//for descending
Collections.sort(list, Collections.reverseOrder());
System.out.println(list); //54321

	}
}


