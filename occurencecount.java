
import java.util.Scanner;
public class occurencecount {
    public static void main(String s[]){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        long  j ;
        long i = sc.nextLong();
        int count = 0;
        System.out.println("Enter number u want to count");
        int k = sc.nextInt();
        while(i!=0){
            j = i % 10;
            i = i / 10 ;
            if( j == k){
                count++;
            }
        }

        System.out.println(count);
        sc.close();




    }
}
