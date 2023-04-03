import java.util.Scanner;
public class Main {
    public static void main(String s[]){
        System.out.println("hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int i = sc.nextInt();
        System.out.println("Enter second number");
        int j = sc.nextInt();
        System.out.println("Enter third number");
        int k = sc.nextInt();

        if((i > j) && (i > k)){
                System.out.println("i");
        }

        else if( (j > k)){
            System.out.println("j");
        }

        else{
            System.out.println("k");
        }
        System.out.println(i);
        sc.close();

    }
}
