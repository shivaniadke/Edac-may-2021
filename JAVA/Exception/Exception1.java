import java.io.FileInputStream;

// An exception is an unwanted or unexpected event which occurs during the execution of a program i.e at run time that disrupts the normal flow of the program
//advantage of exception handling is that it doesnt not allow software to get crash
//Throwable is the parent class of exception it inherts exception and error
//exception --->occurs due to our program  and // Error--->(lack orf system resources
//Exception are recoverable
//Exception ane two types checked(compile time exception) and unchecked exception(run time exception)
//Errors are only one type i.e runtime exception
//parent class of throwable is object ,object is the parent class of all classes
//compile time error means error occuring on run time

/*
  class Exception1 {
  
   public static void main(String args[]) { int a=100, b=0 ,c; c=a/b;
  
  //Exception in thread "main" java.lang.ArithmeticException: / by zero at
  Exception1.main(Exception1.java:17)
  
  System.out.println(c); } }
 */


//Whenever their is exception the method in which ocurrs will create object and that object will store three thing 
//     1.exception name
//     2.description
//     3.stack trace
// main methods create one exception object and that is passed to JVM then jvm checks whether they can handle it or not
//If JVM do not handle the exception then the exception is handled by "Default exception handler" and will terminate the program .

/*class Exception1 {
  
   public static void main(String args[]) {
	   
	   int a=100, b=0 ,c; c=a/b;
	   System.out.println(c);
	   } 
   }
*/


//Exception is handled through 5 keyword 1.try 2.catch 3.finally 4.throw 5.throws
/*
//syntax                                
try                                                          try
{         													 { int a=100, b=0,c;
															 c= a/b;
	//risky code											 sopln(c);
}															 }

catch(ExceptionClassName ref.var.name)						 catch(ArithmeticException e)       //Exception  e is the object which gets created
{															 {
	//handeling code                                         sopln(e); /("you cannnot divide by zero");
}															 }
*/

/*
  class Exception1 {
   
   static void main(String args[]) { 
   try {
    FileInputStream fis = new FileInputStream("d:/abc.txt"); 
   } catch(Exception e)
    {
   System.out.println("Helllo"); 
   } 
   }
   }
 */   
	   
/*class Exception1 {
	   
	  public static void main(String args[]) { 
	   try {
	    FileInputStream fis = new FileInputStream("d:/abc.txt"); 
	   } catch(Exception e)
	    {
		   System.out.println(e);
	    }
	  
	   System.out.println("Helllo"); 
	   } 
	   }*/

//java.io.FileNotFoundException: d:\abc.txt (The system cannot find the file specified)
//Helllo
	   
/*class Exception1 {
	   
	  public static void main(String args[]) { 
		  System.out.println(" 1");
	   try {
		   System.out.println("2");
		   int a=100 , b=0, c;
		   c=a/b;
		   System.out.println("4");
		   System.out.println(c);
		   System.out.println("5");
	
	   } catch(Exception e)
	    {
		   System.out.println("6");
		   System.out.println(e);
		   System.out.println("7");
	    }
	  
	   System.out.println("Helllo"); 
	   } }
	  
*/  

/*
 * class Exception1 {
 * 
 * public static void main(String args[]) { try { int a=100, b=0 ,c; c=a/b;
 * System.out.println(c); } catch(ArithemeticException ae) {
 * ae.printStackTrace(); } //e.printStackTrace(); is used for printing all
 * description with exception
 * 
 * }}
 */
class Exception1 {
	  
	   public static void main(String args[]) {
		   try {
		   int a=100, b=0 ,c;  c=a/b;
		   System.out.println(c);
		   } catch(ArithmeticException ae) 
		   {
		   //ae.printStackTrace();
			   //System.out.println(ae);
			  // System.out.println(ae.toString()); // printing exception name and description
		   System.out.println(ae.getMessage());  /// by zero
		   }
		   //e.printStackTrace(); is used for printing all description with exception
		   
	   }}

	 


