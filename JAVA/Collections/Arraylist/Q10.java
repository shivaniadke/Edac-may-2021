import java.util.Collections;

//Write a Java program to shuffle elements in an array list
import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList<String>();
		list.add("Black");  //0
		list.add("White");  //1
		list.add("Green");  //2
		list.add("Blue");   //3
		System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println(list);
        //Black, White, Green, Blue]
      // [Green, White, Black, Blue]
    }
    
}
