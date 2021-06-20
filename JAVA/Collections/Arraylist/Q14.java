//Write a Java program of swap two elements in an array list.
import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(1);  //0
        list.add(2);  //1
        list.add(3);//2
        list.add(4);//3
        System.out.println(list);
        Collections.swap(list, 1, 3);
        System.out.println(list);
    
}
}
