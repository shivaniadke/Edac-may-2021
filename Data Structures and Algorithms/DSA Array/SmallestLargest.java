package Array;
//How to find kth smallest element in an unsorted array?
//6. How to find kth largest element in an unsorted array?

public class SmallestLargest {
    public static void main(String[] args) {
    int arr[]={7,8,1,5,4,66,22,13};
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++){
            int temp=0;
            if(arr[i]>arr[j]){

            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
        }
        System.out.println(arr[i]);
    }
    int temp=arr[arr.length-1];
    System.out.println("Largest Element : " + temp);
    int temp2=arr[1];
    System.out.println("Second smallest : " +temp2);

    
}
}








