package Practice;
import java.util.*;

 class Student1 {
    Scanner sc = new Scanner (System.in);
    String Name;
    int Rollno;
    long phone;
    String Address;
void getinfo(){
       
        System.out.println("Enter the name: ");//shree
        this.Name = sc.nextLine();
        System.out.println("Enter the Rollno: ");//23
        this.Rollno = sc.nextInt();
        System.out.println("Enter the phone: ");//4665468
        this.phone = sc.nextLong();
        System.out.println("Enter the Address: ");//afDEFDfes
        sc.nextLine();
        this.Address = sc.nextLine();
        
}
void display()
{
    System.out.println("=================================================================");
    System.out.println("name" +Name+ "\nrollno" +Rollno+ "\nphone" +phone+ "\naddress" +Address);
}


}
public class Student2{
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<Student1>();
        for(int i=0;i<list.size();i++)
       { 
           Student1 obj = new Student1();
            obj.getinfo();
            list.add(obj);

    }
    for(int i=0;i<list.size();i++){
    list.get(i).display();
    }
        }
    }
 

