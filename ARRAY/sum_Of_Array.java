package ARRAY;

import java.util.Scanner;

public class sum_Of_Array {

    int arraySum(int arr[]) {
        // code here
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        return sum;
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

        sum_Of_Array obj = new sum_Of_Array();
        int result = obj.arraySum(arr);

        System.out.println("Sum of array = " + result);
    }
}
