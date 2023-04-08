import java.util.*;
import java.util.Scanner;

public class selectionsort {
    public static void main(String s[]){
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
                System.out.print(arr[i]);
            }

            
            for(int i = 0 ; i < size ; i++){
                int smallest = i ;
                for(int j = i+1 ; j< size ; j++){
                    if(arr[smallest] > arr[j]){
                        smallest = j ;
                    }
                }  
                int temp = arr[smallest];
                arr[smallest] = arr[i] ;
                arr[i] = temp;
                        }

            
        for(int i = 0 ;  i < size ; i++){
            System.out.print(arr[i]+" ");
        }

        


    
        }
}
