package ClassandObjects;

//Print the average of three numbers entered by user by creating a class named 'Average' having a
//method to calculate and print the average
import java.util.*;
public class AverageQ8 {

    int no1;
    int no2;
    int no3;
    public static void main(String[] args) {
        AverageQ8 obj = new AverageQ8();
        obj.getNumber();
        obj.setAverage();
    }

    void getNumber(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the no1: ");
        this.no1 = sc.nextInt();
        System.out.println("Enter the no2: ");
        this.no2 = sc.nextInt();
        System.out.println("Enter the no3: ");
        this.no3 = sc.nextInt();
    }

    void setAverage(){
        int Average=((no1+no2+no3)/3);
        System.out.println("Average is:" +Average);
    }
    
}
