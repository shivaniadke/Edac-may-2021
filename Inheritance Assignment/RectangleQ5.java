package ClassandObjects;
// Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by
// creating a class named 'Rectangle' with a method named 'Area' which returns the area and length
// and breadth passed as parameters to its constructor

class Rectangle{
    
    int length;
    int breadth;
    void Area(int l, int b)
    {
    length=l;
    breadth=b;
    }
    void display()
    {
       int area=length*breadth;
        System.out.println("Area of Rectangle is =" +area);
        }
}

    public  class RectangleQ5 {
        public static void main(String[] args) {
            Rectangle obj = new Rectangle();
            obj.Area(4,5);
            obj.display();
            Rectangle obj2 = new Rectangle();
            obj2.Area(5,8);
            obj2.display();
         }
    }
