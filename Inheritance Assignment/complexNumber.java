package ClassandObjects;

import java.util.Scanner;

// Print the sum, difference and product of two complex numbers by creating a class named 'Complex'
// with separate methods for each operation whose real and imaginary parts are entered by user.

class complexNumber
{
    double real1;
    double real2;
    double imaginary1;
    double imaginary2;
 public static void main(String[] args) {
    
        complexNumber obj = new complexNumber();
        obj.getNumber1();
        obj.showNumbers();
    }
void getNumber1()
{
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the real no1 :");
    this.real1 = sc.nextDouble();
    System.out.println("Enter the imaginary no1 :" +"i");
    this.imaginary1 = sc.nextDouble();
    System.out.println("Enter the real no2 :");
    this.real2 = sc.nextDouble();
    System.out.println("Enter the imaginary no2 :" +"i");
    this.imaginary2 = sc.nextDouble();
}
double add(double a,double b){
    return a+b;
}
double diff(double a,double b){
    return a-b;
}
double product(double a,double b){
    return a*b;
}
void showNumbers()
{   

    System.out.println("First complex number is........:" +real1+" + "+imaginary1+ "i");
    System.out.println("Second complex number is.......:" +real2+" + "+imaginary2+ "i");
    
    // double sum1=real1+real2;
    // double sum2=imaginary1+imaginary2;
    // double difference1=real1-real2;
    // double difference2=imaginary1-imaginary2;
    // double product1=real1*real2;
    // double product2=imaginary1*imaginary2;
    
    double sum1 = add(real1,real2);
    double sum2 = add(imaginary1,imaginary2);
    double difference1 = diff(real1,real2);
    double difference2 = diff(imaginary1,imaginary2);
    double product1 = product(real1,real2);
    double product2 = product(imaginary1,imaginary2);
    System.out.println("Sum of complex number..........: " +sum1+ " + " +sum2+"i");
    System.out.println("Difference of complex number...: " +difference1+ " + " +difference2+"i");
    System.out.println("Product of complex number......: " +product1+ " + " +product2+"i");
}
}


