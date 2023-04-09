//printing number from 5 to 1
import java.util.Scanner;
import java.util.*;

public class recurrsion {
    public static void primeNumber(int n){
        if(n == 0){
            return ;
        }

        System.out.print(n);
        primeNumber(n-1);
    }

    public static void primeOneToFive(int n){
        if( n == 6){
            return ;
        }

        System.out.println(n);
        primeOneToFive(n+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        primeNumber(n);
        primeOneToFive(1);
        sc.close();
    }
}
