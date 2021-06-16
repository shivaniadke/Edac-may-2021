package ClassandObjects;

import java.util.Scanner;

// Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
// First method named as 'setDim' takes length and breadth of rectangle as parameters and the second
// method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are
// entered through keyboard.

class Rectangle1{
    int length;
    int breadth;

    void setDim()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of length");
        this.length = sc.nextInt();
        System.out.println("Enter the value of breadth");
        this.breadth = sc.nextInt();
    }
    
    void getArea()
    {
       int area=length*breadth;
        System.out.println("Area of Rectangle is =" +area);
        }
}

    public  class RectangleQ6 {
        public static void main(String[] args) {
            Rectangle1 obj = new Rectangle1();
            obj.setDim();
            obj.getArea();
         }
    }
