import java.util.Scanner;
import java.util.*;

public class inserttionsort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter the elements in any order");
        for(int i = 0 ;  i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before sorting");
        for(int i = 0 ;  i < size ; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Array After sorting");

        for(int i = 1 ; i < size ; i++ ){
            int current = arr[i];
             int j = i - 1 ;
             while( j >= 0 && (current < arr[j])){
                arr[j+1] = arr[j];
                j--;
             }

             arr[j+1] = current ;
        }

        for(int i = 0 ;  i < size ; i++){
            System.out.print(arr[i]+" ");
        }


        
    }
}
