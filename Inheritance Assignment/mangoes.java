package lab;

import java.util.Scanner;

abstract class Fruit{
    static int count=0;
    public abstract void cal(int a);
    
}

class apples extends Fruit{
    public void cal(int a){
    count=count+a;
   }
}

public class mangoes extends apples{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    apples a = new apples();
    System.out.println("Enter the quantity of apples ");
    int app = sc.nextInt();
    a.cal(app);

    mangoes m = new mangoes();
    System.out.println("Enter the quantity of mangoes ");
    int mang = sc.nextInt();
    m.cal(mang);

    System.out.println("quantity of apples " +app);
    System.out.println("quantity of mangoes " +mang);
    10System.out.println("Total quantity of fruits in basket...: " +Fruit.count);

}
}