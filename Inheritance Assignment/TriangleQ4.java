package ClassandObjects;



// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//creating a class named 'Triangle' with constructor having the three sides as its parameters.

public class TriangleQ4 {
    public static void main (String  args[]) {

    dimensions obj = new dimensions(3, 4, 5);
    obj.display();
    }
    }

class dimensions{
    int side1;
    int side2;
    int base;

dimensions(int a, int b, int c){
    side1=a;
    side2=b;
    base=c;
}

void display(){
  int perimeter=side1+side2+base;
    System.out.println("Perimeter = " +perimeter );
int Area=side1*side2;
     Area=Area/2;
     System.out.println("Area : " +Area);
}
}

