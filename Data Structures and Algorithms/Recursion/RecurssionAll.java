


//simple recurssion program
 /*
    class Recurssion11{
    static void fun1(int n)
    {
        if(n==0)
        return;
        
        System.out.println(n);
        fun1(n-1);
    }
public static void main(String[] args) {
    fun1(2);
}

}

*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
public class Recurssion11{

static void fun1()
{
    System.out.println("fun1");
}

static void fun2()
{
    System.out.println("Before fun1");

    fun1();

    System.out.println("After fun1");
}

public static void main (String[] args) {
    
    System.out.println("Before fun2");

    fun2();

    System.out.println("After fun2");

}
}

// Before fun2
// Before fun1
// fun1
// After fun1
// After fun2


*/
////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
class Recurssion11{
public static void main(String[] args) {
    fun(3);
}

    static void fun(int n)
    {
        if(n==0)
        return;
        fun(n-1);
        System.out.println(n); //2 1 3 1 2 1    ********************************************* 
        fun(n-1);
    }
}
    
*/

/////////////////////////////////////////////////////////////////////////////////////////

/*
class Recurssion11{
    public static void main(String[] args) {
        fun(5);
    }
    
        static void fun(int n)
        {
            if(n==0)
            return;
            System.out.println(n);  //5 4 3 2 1
            fun(n-1);
            System.out.println(n);  // 5
        }
    }
*/

//////////////////////////////////////////////////////////////////////////////////////////////


/*
    class Recurssion11{
        public static void main(String[] args) {
            fun(5);
        }
        
            static void fun(int n)
            {
                if(n==0)
                return;
                fun(n-1);
                System.out.println(n);  //1 2 3 4 5
              
                //System.out.println(n);  // 5
            }
        }

        */


        ////////////////////////////////////////////////////////////////////////


        /*
        class Recurssion11{
            public static void main(String[] args) {
                fun(3);
            }
            
                static void fun(int n)
                {
                    if(n==0)
                    return;
                    fun(n-1);
                    System.out.print(n +" "); //
                    fun(n-1);
                    System.out.print(n + " ");
                    // 1 * *****************
                    // 1
                    // 2
                    // 3
                    // 1
                    // 1
                    // 2
                    // 1
                    // 1
                    // 2
                    // 3

                }
            }
    
        */

            /////////////////////////////////////////////////////////////////////////////////////////

     /*
            class Recurssion11{
                public static void main(String[] args) {
                       fun(6);
                }
                
                 static void fun(int n)

                    { 
                        System.out.println(n);
                        if(n<=0)
                        return;
                
                        fun(n-5);
                        System.out.println(n);
                    }
            }

            */
            ////////////////////////////////////////////////////////

            /*
        // TAIL RECURRSION
        
        class Recurssion11{
            public static void main(String[] args) {
                fun(3);
            }
            
                static void fun(int n)
                {
                    if(n==0)
                    return;
                    fun(n-1);
                    System.out.println(n); // 3 2 1
                    
                }
            }

            */

            //sum of n natural numbers
        
            class Recurssion11{
                public static void main(String[] args) {
                    String
                }
                
                    static void sum(int n)
                    {
                        if(n==0)
                        return ;
                     
                        System.out.println(n);
                        sum((n-1)+n);
                    }
                }


           
                
           

            