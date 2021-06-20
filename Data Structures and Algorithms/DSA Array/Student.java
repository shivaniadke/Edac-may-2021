import java.util.*;
 abstract class Student extends Marks{
	abstract void method();
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter students Name " );
		String name = sc.nextLine();
		System.out.println("Enter Rollno Name " );
		int rollno = sc.nextInt();

		physics P = new physics();
		int pmark = P.fun();
		
		Chemistry C = new Chemistry();
		int cmark = C.fun();
		
		Mathematics M = new Mathematics();
		int mmark = M.fun();

		int total_marks = pmark + cmark + mmark;
		int Average = (total_marks/3);
		System.out.println("----------------------------");
		System.out.println("Name"+name+ " Rollno " +rollno+ " Total_Marks " +total_marks+ " Average " +Average);	
		
	}
}
class Marks{
		int rollno;
		String name;
		int marks;
		Scanner sc = new Scanner(System.in);
		Marks(){}
		Marks(int rollno,String name,int marks){
		
		}
		}
		class physics extends Marks{
			public int fun(){
				System.out.println("Enter students physics marks :");
				int Pmark = sc.nextInt();
				return Pmark;
			}
		}
			class Chemistry extends Marks{
				int fun(){
				System.out.println("Enter students Chemistry marks :");
				int Cmark = sc.nextInt();
				return Cmark;
			}
		
			class Mathematics extends Marks{
			int fun(){
				System.out.println("Enter students maths marks :");
				int Mmark = sc.nextInt();
				return Mmark;
			}	
		}
		}
