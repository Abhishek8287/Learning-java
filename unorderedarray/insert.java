package unorderedarray;

import java.util.Scanner;

public class insert {

    public static void main(String s[]) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Enter an unsorted array");
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number you want to insert");
        int k = sc.nextInt();

        arr[i] = k;

        System.out.println("final array");
        for (i = 0; i <= n; i++) {
            System.out.println(arr[i] + " ");
        }

        // sc.close();
    }
}