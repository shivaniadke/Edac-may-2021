package Array;
//How to find the missing number in an integer array of 1
//to 100?
public class MissingNoArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,11};
        int n = arr.length+1;
        int missingNumber=((n)*(n+1))/2;
        for(int i = 0; i<arr.length;i++)
        {
            missingNumber=missingNumber-arr[i];
        }
        System.out.println("Missing Number: " +missingNumber);
    }
}
