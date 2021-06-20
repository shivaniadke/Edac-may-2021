// Take an array of 10 elements. Split it into the middle and
// store the elements in two different arrays. E.g.-
// INITIAL array :
// 1 2 3 4 5 6 7 8 9 10
// After splitting :
// Array 1 : 1 2 3 4
// 5
// Array 2 : 6 7 8 9
// 10


package Array;

public class Splitting {
    public static void main(String[] args) {
    int array[]={1,2,3,4,5,6,7,8,9,10};
    int j=0;
    int array1[]= new int[array.length/2];
    int array2[]= new int[array.length/2];
    for(int i=0;i<array.length/2;i++)
    {
        array1[i]=array[i];
        System.out.print(array1[i]);
    }
    System.out.println("===================");
    for(int i=array.length/2;i<array.length;i++)
    {
        array2[j]=array[i];
        System.out.print(array2[j]);
        j++;
    }

    
}
}

