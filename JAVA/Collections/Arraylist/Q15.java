import java.util.ArrayList;

//Write a Java program to join two array lists.

public class Q15 {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList<String>();
        list.add("Black");  //0
        list.add("White");  //1
        list.add("Green");  //2
        list.add("Blue");   //3
        ArrayList <String>list2 = new ArrayList<String>();
        list2.add("Black");  //0
        list2.add("White");  //1
        list2.add("Green");  //2
        list2.add("Blue");   //3
        list2.add("lilac");   //4
        list2.add("White");  //5
        list.addAll(list2);
        System.out.println(list);
       // [Black, White, Green, Blue, Black, White, Green, Blue, lilac, White]
}
}
