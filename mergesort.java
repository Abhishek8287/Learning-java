import java.util.*;
import java.util.Scanner;

public class mergesort {

        public static void conquer(int arr[] , int si , int mid , int ei){
            int indx1 = si ;
            int indx2 = mid + 1 ;
            int x = 0;
            int merged [] = new int[ei-si + 1];

            while(indx1 <= mid && indx2 <= ei){
                if(arr[indx1] >= arr[indx2]){
                    merged[x] = arr[indx2];
                    x++;
                    indx2++;
                }
                else{
                    merged[x] = arr[indx1];
                    x++;
                    indx1++;
                } 
            }

            while(indx1 <= mid){
                merged[x] = arr[indx1];
                x++;
                indx1++;
            }
            while(indx2 <= ei){
                merged[x] = arr[indx2];
                x++;
                indx2++;
            }

            for(int i = 0  , j = si; i < merged.length ; i++ , j++){
                arr[j] = merged[i];
            }

            
        }
        public static void divide(int arr[] , int si , int ei){
            if(si >= ei){
                return;
            }
            int mid = si + (ei-si)/2;
            divide(arr , si , mid);
            divide(arr , mid+1 , ei);
            conquer(arr , si , mid , ei);

        } 
        public static void main(String args[]){
        int []arr = {8 , 9 , 2 , 4 , 6};
        divide(arr , 0 , arr.length - 1);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
    }
}
