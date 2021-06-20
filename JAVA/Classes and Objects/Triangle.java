package ClassandObjects;

// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
// creating a class named 'Triangle' without any parameter in its constructor.

import java.util.*;
public class Triangle {
    public static void main (String  args[]) {

    dimensions1 obj = new dimensions1();
    obj.getinfo();
    obj.display();
    }
    }
class dimensions1
{
    int side1;
    int side2;
    int base;

void getinfo(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side1 value :");
    this.side1 = sc.nextInt();
    System.out.println("Enter the side2 value :");
    this.side2 = sc.nextInt();
    System.out.println("Enter the base value :");
    this.base = sc.nextInt();
}

void display(){
  int perimeter=side1+side2+base;
    System.out.println("Perimeter = " +perimeter );
int Area=side1*side2;
     Area=Area/2;
     System.out.println("Area : " +Area);
}
}

// Enter the side1 value :
// 3
// Enter the side2 value :
// 4
// Enter the base value :
// 5
// Perimeter = 12
