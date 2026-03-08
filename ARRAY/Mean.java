package ARRAY;

import java.util.Scanner;

public class Mean {

    public static int findMean(int[] arr) {
        // code here
        int sum=0;
        int n=arr.length;

        for(int i=0;i<n;i++){

            sum=sum+arr[i];
        }
        return sum/n;
    }

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
    int n = sc.nextInt();

    int arr[] = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int result = findMean(arr);

        System.out.println("Mean of array = " + result);

}
    }


