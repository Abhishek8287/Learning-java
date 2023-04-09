import java.util.Scanner;
public class factorial {
        public static void fact(int n , int mult){
            if( n == 0){
                System.out.println(mult);
                return ;
            }
            mult = mult*n;
            fact(n-1 , mult);
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            fact(n , 1);
        }
}
