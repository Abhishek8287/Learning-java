
import java.util.Scanner;
public class fibbonaci {
    public static void main(String s[] ){
        int i = 0;
        int j = 1 ;
        int sum = 0 ;

        System.out.println("Enter the position u want in fibbonacci series ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if( n == 0){
            System.out.println(i);
        }

        else if(n==1){
            System.out.println(j);
        }

        else{
            for(int k = 2 ; k <= n ; k++){
                sum = i + j ;
                i = j ;
                j = sum ;
                
            }
            System.out.println(sum);
        }

        sc.close();
    }
}
