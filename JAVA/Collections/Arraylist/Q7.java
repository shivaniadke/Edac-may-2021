import java.util.ArrayList;

//7. Write a Java program to search an element in an array list. 


public class Q7 {
	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");   //3
		System.out.println(list);
		boolean b= list.contains("Green");
		if(b){
			System.out.println("List contain the element searched "   +b );
		}
		else
		{
			System.out.println("List does not contain given element");
		}
		


	}

}
