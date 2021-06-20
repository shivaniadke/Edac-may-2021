import java.util.ArrayList;

//6 Write a Java program to remove the third element from an array list. 

public class Q6 {
	public static void main(String[] args) {
		ArrayList <String>list = new ArrayList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");   //3
		System.out.println(list);
		list.remove(1);
		{
			System.out.println(list);
		}
		


	}

}

