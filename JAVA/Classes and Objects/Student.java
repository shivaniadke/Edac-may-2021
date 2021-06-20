// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the
// value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

package ClassandObjects;


import java.util.*;
public class Student {
    String Name;
    int Rollno;

    void parameters(String n,int r){
    this.Name=n;
    this.Rollno=r;
    }

    void display(){
        System.out.println("Student Name....:" +Name+ "\nRoll no...: " +Rollno);
    }

    public static void main(String[] args) {
        Student obj = new Student();
        obj.parameters("JOHN" , 24);
        obj.display();
    }
    
}
