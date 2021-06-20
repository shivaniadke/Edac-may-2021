//An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method,If not caught there, the exception again drops down to the previous method, and so on until they are caught or until they reach the very bottom of the call stack.This is called exception propagation.

/*
class Propagation{  
  void m(){  
    int data=50/0;  
  }  
  void n(){  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e)
   {
	   System.out.println("exception handled");
	   }  
  }  
  public static void main(String args[]){  
   Propagation obj=new Propagation();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  

//Output:exception handled
       normal flow...
*/




import java.io.IOException;  
class Propgation{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Propgation obj=new Propgation();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  