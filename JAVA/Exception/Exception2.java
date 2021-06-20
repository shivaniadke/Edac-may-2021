/*
 * public class Exception2{ try{
 * 
 * } catch(exception e) {
 * 
 * } 
 * finally { // we can directly finally after the try but exception will not
 * be handel //but we can not only use finnally }
 * 
 * 
 * }
 */

/*
public class Exception2{ 
	public static void main(String[] args) {
	
	try
	{ 
		int a=100, b=2,c;
				c=a/b;
				System.out.println(c);  //50
    }
    catch(ArithmeticException e)
	{
    	System.out.println(e);
    }
  finally 
  { 
	  System.out.println("i am in the finally block");   //i am in the finally block
  }
}
	}
     
*/


public class Exception2{ 
	public static void main(String[] args) {
	
	try
	{ 
		int a=100, b=0,c;
				c=a/b;
				System.out.println(c);  
    }
//	i am in the finally block
//	Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at Exception2.main(Exception2.java:43)
 
  finally 
  { 
	  System.out.println("i am in the finally block");   //i am in the finally block
  }
}
	}