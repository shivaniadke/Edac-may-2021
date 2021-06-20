import java.util.ArrayList;

//Write a Java program to empty an array list. 


public class Q17 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("First");
        list.add("Second");
        list.add("SHIVANI");
        list.add("Fourth");
        list.add("Fifth");
        System.out.println(list);
        list.clear();
        System.out.println(list);
}
}

