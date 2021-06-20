package Array;
//How to find the missing number in an integer array of 1
//to 100?

import java.util.Scanner;
public class Question1 {
       public static void main(String[] args) {
        for(int i=0;i<100;i++){
            int arr[] = new int[100];
            int n;

        }    //Finding the missing number
          int sumOfAll = (n*(n+1))/2;
          int sumOfArray = 0;
          for(int i=0; i<=n-2; i++) {
             int[] inputArray;
            sumOfArray = sumOfArray+inputArray[i];
          }
          int missingNumber = sumOfAll-sumOfArray;
          System.out.println("Missing number is: "+missingNumber);
       }
    }