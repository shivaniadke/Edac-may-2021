package Array;
//How to find the largest and smallest number in an unsorted
//array?
public class UnsortedArray {
        public static void main(String args[])
        {
        int arr[] = {60,5,6,28,9,55};
        int n = arr.length;
        int i= 0;
        int large = arr[i]; 
        int small =arr[i];
        for(i=1;i<n;i++)
        {
        if(arr[i] > large)
        large=arr[i];
        
        if(arr[i] < small)
        small=arr[i];
        }
        
        System.out.println("The smallest element is " + small );
        System.out.println("The largest element is " + large );
        }
        
	}