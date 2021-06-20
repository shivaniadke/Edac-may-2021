//3. Write a Java program to insert an element into the array list at the first position.
import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list = new ArrayList<String>();
list.add("first");
list.add("second");
list.add("third");
list.add("fourth");
list.add( 0,"fifth");
list.add(3,"sixth");


for(int i=0; i<list.size(); i++)
{
	System.out.println(list.get(i));
}
		
}

}