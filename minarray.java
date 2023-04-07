import java.util.Scanner;
public class minarray {

    public static void minElementArray(int arr[]){
        int len = arr.length ;

        int min = arr[0] ;

        for(int i =1;i< len; i++){
            if(arr[i] < min){
                min = arr[i] ;
            }
        }

        System.out.println("Smallest element : "+min);
    }
    public static void main(String s[]){
             System.out.println("Enter the length of array");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array elements");
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            minElementArray(arr);
    }
            
}
