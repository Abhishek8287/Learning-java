import java.util.Scanner;

public class Duplicatefromsortedarray {
        public static void main(String s[]){
            System.out.println("Enter the length of array");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array elements");
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }

            int rd = 0 ;
            for(int j=1 ; j < arr.length ; j++){
                    if(arr[rd]!=arr[j]){
                        rd++;
                        arr[rd] = arr[j];
                    }
                    else{
                        continue;
                    }
            }
            //printing arrray
            for(int k = 0 ; k <= rd ; k++){
                System.out.println(arr[k] + " ");
            }

        }
}
