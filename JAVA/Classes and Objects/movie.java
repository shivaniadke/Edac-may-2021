package ClassandObjects;import java.util.*;
class movie{

String movie_name;
String movie_hero;
int  movie_rating;

Scanner sc= new Scanner (System.in);

void get_movie_details()
{
	System.out.println("Enter the movie name");
	this.movie_name= sc.nextLine();
	System.out.println("Enter the movie rating");
	this.movie_rating= sc.nextInt();
	System.out.println("Enter the movie hero");
	this.movie_hero= sc.nextLine();
	this.movie_hero= sc.nextLine();
	
}

void show()
{
	System.out.println("+++++++++++++++++++++++");
	System.out.println("movie name"+movie_name);
	System.out.println("movie rating"+movie_rating);
	System.out.println("movie hero"+movie_hero);	
}

boolean search(String mvname) {
        if (movie_name.equals(mvname)) {
            show();
            return (true);
        }
        return (false);

}
}
class movie1{
public static void main (String [] args){
Scanner scn= new Scanner (System.in);
String mvname;
System.out.println("enter how many number of movies you want to add ");
int number= scn.nextInt();
movie array[]= new movie[number];
int choice;

do {
	System.out.println("1.movie add rating\n 2. movie show review\n 3. exit");
	choice= scn. nextInt();
	
	switch(choice){
		
		case 1:
		
		for (int i=0;i<array.length;i++)
		{
		//array[i]= new movie();	
		array[i].get_movie_details();
			
		}
		break;
		
		case 2:
		System.out.println("enter the movie name u want to find");
		mvname= scn.next();
		boolean found= false;
		for (int i=0;i<array.length;i++)
		{
			found= array[i].search (mvname);
			if (found) 
		    break;
		
		}
		
		break;	

		default :
		System.out.println("invalid choice");
	}
}
while(choice!=3);

}}
