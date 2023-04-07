import java.util.*;
public class Removeduplcicatesfromunsortedarray {

    public static void removeUsingSorting(int temp[]){
            int len = temp.length ;
            Arrays.sort(temp);
            int rd = 0 ;
            for(int i = 1; i < len ; i++){
                    if(temp[rd]!=temp[i]){
                        rd++;
                        temp[rd] = temp[i];
                    }
                    else{
                        continue;
                    }
            }

            for(int i = 0 ; i <= rd ; i++){
                System.out.print(temp[i]+" ");
            }
    }

    public static void removeUsingHashmap(int arr2[]){
        int len  = arr2.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            if(map.containsKey(arr2[i])){
                map.put(arr2[i], map.get(arr2[i])+1);
            }
            else{
                map.put(arr2[i],1);
            }
        }

        map.forEach((k,v)->System.out.print(k+" "));

    }

    // public static void removeUsingHashset(int check[]){
    //     int len = check.length;
    //     Set <Integer> set = new HashSet<Integer>() {
            
            
    //     };
    // }
    public static void main(String s[]){
            System.out.println("Enter the length of array");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the array elements in anyorder");
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("print using brutforce approach O(Nlogn)");
            removeUsingSorting(arr);
            System.out.println("print using second(optimul) approach O(n)");
            removeUsingHashmap(arr);
            System.out.println("print using set approach O(n)");
            // removeUsingHashset(arr);
    }
}
