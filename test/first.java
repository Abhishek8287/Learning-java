import java.util.*;

public class first {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
       // int maxCount = -1;
        int i,j,k,m,max;
        for (i = 0; i < n - 1; i++) {
            max = arr[i + 1];
           for (j = i + 1; j < n; j++) {
            
               if (arr[j] > max) {
                   max = arr[j];
                   count++;
               }
           }
        
           System.out.println(count);
           count = 1;
       }
System.out.println(0);

    }
}
