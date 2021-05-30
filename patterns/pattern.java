
/*
class pattern6
{
public static void main(String args[])
{
		for (int i=1; i<=5; i++) 
		{
		for (int j=1; j<=5; j++)
		{
			if(j>=6-i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println(" ");
		}
}
}
	


//----*
//---**
//--***
//-****
//*****
 */
 
 
 class pattern
{
public static void main(String args[])
{
		for (int i=1; i<=5; i++) 
		{ 
			System.out.println();
	
		for (int j=1; j<=5-i;j++)
		{
				System.out.print(" ");
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
		}
		}
}
}