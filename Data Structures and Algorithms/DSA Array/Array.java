package Array;
// Write a program to find all pairs on an integer array whose sum
// is equal to a given number?
// Eg :
// Input : 1 2 4 5 3 6 3 7
// Output: 3, 3 and 4, 2
// 6,1 and 4 , 3


public class Array {
    static void printPairs(int arr[],
    int n, int sum)
{
for (int i = 0; i < n; i++)
for (int j = i + 1; j < n; j++)
if (arr[i] + arr[j] == sum)
System.out.println("(" + arr[i] + ", " + arr[j] + ")");
}
public static void main(String[] arg)
{
int arr[] = { 1, 5, 7, -1, 5 };
int n = arr.length;
int sum = 6;
printPairs(arr, n, sum);
}
}



// (1, 5)
// (1, 5)
// (7, -1)