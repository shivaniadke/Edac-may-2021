// Write a Java program to update specific array elements by a given element. 
import java.util.*;
public class Q5 {

	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");   //3
		System.out.println(list);
		list.set(3,"Red");
		{
			System.out.println(list);
		}
		


	}

}
