// Create a class named Shape with a function that prints "This is a
// shape". Create another class named Polygon inheriting the Shape
// class with the same function that prints "Polygon is a shape".
// Create two other classes named Rectangle and Triangle having
// the same function which prints "Rectangle is a polygon" and
// "Triangle is a polygon" respectively. Again, make another class
// named Square having the same function which prints "Square is a
// rectangle".



package lab;

import org.w3c.dom.css.Rect;

public class Shape{
void F1(){
    System.out.println("This is a shape");
}
      public static void main(String[] args) {
        Shape obj = new Shape();
        Polygon obj1 = new Polygon();
        Rectangle obj2 = new Rectangle();
        Triangle obj3 = new Triangle();
        Square obj4 = new Square();
        obj.F1();
        obj1.F1();
        obj2.F1();
        obj3.F1();
        obj4.F1();
    }
}

class Polygon extends Shape
{
    void F1(){
        System.out.println("Polygon is a shape");}
}
class Rectangle extends Shape
{
    void F1(){
        System.out.println("Rectangle is a polygon");}
}
class Triangle extends Shape
{
    void F1(){
        System.out.println("Triangle is a polygon");}
}

class Square extends Shape
{
    void F1(){
        System.out.println("Square is a rectangle");}
}
