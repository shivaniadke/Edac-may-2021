//Final finally finalize
// final is keyword finally is the block finalize method
//final can be used with method variable or class
//in final value becomes constant 
//final int a=10
//final void show

////finally is used with try catch block
//finalize method is direct override
//finalize method is used just prior to the garbage collection (i.e objets are going to delete etc)
/*
try {
	
}(ArthmeticException e)
catch(Exception e)
{
	
}
*/
//in first catch parent block child class can and then parent
//with try we can use multiple catch blocks
//we can not put one same name in two catch blocks

/*class Exception3{  
 public static void main(String args[]){  
  try{  
    try{  
     System.out.println("going to divide");  
     int b =39/0;  
    }catch(ArithmeticException e)
    {
    	System.out.println(e);
    }  
   
    try{  
    int a[]=new int[5];  
    a[3]=4;  
    }catch(ArrayIndexOutOfBoundsException e)
    {
    	System.out.println(e);
    	}  
     
    System.out.println("other statement");  
  }catch(Exception e){System.out.println("handeled");}  
  
  System.out.println("normal flow..");  
 }  
}*/



/*
//Let's see the java finally example where exception doesn't occur.

class Exception3{  
  public static void main(String args[]){  
  try{  
   int data=25/5;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  
*/

class Exception3{  
  public static void main(String args[]){  
  try{  
   int data=25/0;  
   System.out.println(data);  
  }  
  catch(NullPointerException e){System.out.println(e);}  
  finally{System.out.println("finally block is always executed");}  
  System.out.println("rest of the code...");  
  }  
}  









