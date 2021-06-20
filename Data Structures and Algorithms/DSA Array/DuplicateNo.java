package Array;
// How to find repeated numbers in an array if it contains
//multiple duplicates?

public class DuplicateNo {
    public static void main(String[] args) {
        int arr[]={1,2,2,6,5,6,7,8,9,11,8,10};
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++)
           {
               if (arr[i]==arr[j])
               System.out.println(arr[i]);
           }
       }
    }
}

    

