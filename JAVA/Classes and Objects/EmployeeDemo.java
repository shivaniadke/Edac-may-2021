package Practice;
/*
class Employee {
    private String empName;
    private int empID;
    
    void set(String name,int id){
        empName = name;
        empID = id;
    }
    void show(){
        System.out.println(empName+" "+empID);
    }
}

class EmployeeDemo{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.set("Ram",101);
        e.show();
    }
}            */

import java.util.Scanner;

/*
class Employee {
    private String empName;
    private int empID;
    
    void set(String empName,int empId){
       this.empName=empName;
        this.empID=empId;
    }
    void show(){
        System.out.println(empName+" "+empID);
    }
}

class EmployeeDemo{
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("e = "+e);
        e.set("Ram",101);
        e.show();
        Employee e1 = new Employee();
        System.out.println("e1 = "+e1);
        e.set("shiv",102);
        e.show();
    }
}
//---------------------------------------------------*/


/*
class Employee {
    private String empName;
    private int empID;
    
    void set(String empName,int empId){
        System.out.println("this = " +this); // this is a keyword which is used to store reference of the current object.
       this.empName=empName;
        this.empID=empId;
    }
    void show(){
        System.out.println(empName+" "+empID);
    }
}

class EmployeeDemo{
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("e = "+e);
        e.set("Ram",101);
        e.show();
        Employee e1 = new Employee();
        System.out.println("e1 = "+e1);
        e.set("shiv",102);
        e.show();
    }
}

*/

/*

class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
   public class EmployeeDemo{  
    public static void main(String args[]){  
    Student s1=new Student(111,"ankit",5000f);  
    Student s2=new Student(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
    }}

    //111 ankit 5000.0
// 112 sumit 6000.0

*/

////////////////////////////////////////////////////////////////////////////////////////////////////

/*
class Employee {
    private String empName;
    private int empID;
    
    void set(String empName,int empId){
        System.out.println("this = " +this); // this is a keyword which is used to store reference of the current object.
       this.empName=empName;
        this.empID=empId;
    }
    void show(){
        System.out.println(empName+" "+empID);
    }
}

*/


/*
import java.util.*;

class Employee {
    private String empName;
    private int empID;
    
    void set(String empName,int empId){
        System.out.println("this = " +this); // this is a keyword which is used to store reference of the current object.
       this.empName=empName;
        this.empID=empId;
    }
    void show(){
        System.out.println(empName+" "+empID);
    }
}

public class EmployeeDemo{
    public static void main(String[] args) {
      Scanner sc =new Scanner (System.in);
      Employee ar[] = new Employee[2];
      for(int i=0;i<=ar.length;i++)
      {
          System.out.println();
      }

       
    }
}
*/
import java.util.*;

class Rectangle{
        
    // int length;
    // int breadth;

    static void Area(int length, int breadth){
    length=length;
    breadth=breadth;
 }

// void getValue()
// {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the value og length :");
//     this.length = sc.nextInt();
//     System.out.println("Enter the value og breadth :");
//     this.breadth = sc.nextInt();
// }

void display()
{
    int Area=length*breadth;
    System.out.println("The value of Area: " +Area);
}
}

public class EmployeeDemo{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.Area(6,7);
        //rect.getValue();
        rect.display();
    Rectangle.Area(8,9);
    }
}

