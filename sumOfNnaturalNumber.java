import java.util.*;
import java.util.Scanner;

public class sumOfNnaturalNumber {

    public static void sum(int n , int sum ){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sum(n-1 , sum);

        
    }
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sum(n , 0);
        sc.close();
    }
}
