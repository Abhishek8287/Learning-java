import java.util.Scanner;
import java.util.*;

public class sortingbubble {
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

        for(int  i  = 0 ; i < size - 1 ; i++){
            for(int j = 0 ; j < size-i - 1 ; j++){
                
                if(arr[j] > arr[j+1] ){
                    int temp;
                    temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }


        for(int i = 0 ;  i < size ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
