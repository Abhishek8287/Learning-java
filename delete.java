import java.util.Scanner;
public class delete {
    public static void main(String s[]){
        System.out.println("ENter the size of array");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements");
        for(int i =0  ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to delete");
        int j = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            if(arr[i] == j){
                arr[i]=0;
                for(int k = i ; k<(n-1) ; k++){
                    arr[k] = arr[k+1];
                }
            }
        }
        n = n - 1 ;
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]+" ");
        }

        sc.close();
    }

}
