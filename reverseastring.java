import java.util.*;
import java.util.Scanner;
public class reverseastring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder("");

        sb.append(sc.nextLine());

        int len = sb.length();

        for(int i = 0 ; i < (len/2)  ; i++){
            int front =  i ;
            int back = len - 1 - i ;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
        sc.close();
    }
}
