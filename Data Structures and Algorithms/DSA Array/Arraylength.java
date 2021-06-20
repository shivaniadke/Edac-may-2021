package Array;
import java.util.*;

public class Arraylength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered Elements");
        int arr[] = new int[5];
        for(int i=0;i<3;i++)
        
        {
            
            arr[i] = sc.nextInt();
        }
        {
        System.out.println("Enter Element");    
        for(int i=0;i<3;i++)
        System.out.println(arr[i]);
        }
    
}
}


/*
//array using .length
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered Elements");
        int arr[] = new int[3];
        for(int i=0;i<arr.length;i++) //it can go till whatever array is created
        
        {
             arr[i] = sc.nextInt();
        }
        {
        System.out.println("Enter Element");    
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
        }
    }
}

*/