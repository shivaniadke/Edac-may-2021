package Array;
//Write a program to find the intersection of two sorted arrays
//in Java?

public class Intersection {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int arr1[]={1,4,6};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr1.length;j++)
        {
            if (arr[i]==arr1[j]) 
           // arr[i]=0;

        
           System.out.println(arr[i]);
        }

    }//for not insertion elements
    //for(int i:arr){
        
        //if(i!=0)
        //System.out.println(i);
    //}
    
    }}

    

