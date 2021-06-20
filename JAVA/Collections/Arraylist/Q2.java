//Write a Java program to iterate through all elements in an array list. 


import java.util.*;
public class Q2 {

	public static void main(String[] args) {
			ArrayList <Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			//Iterating through all elements
			/*Iterator<Integer> itr = list.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());*/
			for(Integer number:list)
			System.out.println(number); {
					
				}
	}
}


	
