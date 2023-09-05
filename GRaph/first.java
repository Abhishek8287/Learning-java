import java.util.*;

public class first {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> adjanlist = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < 5; i++) {
            adjanlist.add(new ArrayList<Integer>());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Enter source node and destination node");
            int s = sc.nextInt();
            int d = sc.nextInt();
            addEdge(adjanlist, s, d);
        }
        // addEdge(adjanlist, 0, 1);
        // addEdge(adjanlist, 0, 2);
        // addEdge(adjanlist, 0, 3);
        // addEdge(adjanlist, 1, 4);
        // addEdge(adjanlist, 2, 3);
        // addEdge(adjanlist, 3, 4);

        displayGraph(adjanlist);

    }

    public static void addEdge(ArrayList<ArrayList<Integer>> adjlist, int i, int j) {
        adjlist.get(i).add(j);
        adjlist.get(j).add(i);
    }

    public static void displayGraph(ArrayList<ArrayList<Integer>> adjlist) {
        for (int i = 0; i < adjlist.size(); i++) {
            System.out.print("path from " + i + "to");
            for (int j = 0; j < adjlist.get(i).size(); j++) {
                System.out.print("-> " + adjlist.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

// path from 0to-> 1 -> 2 -> 3 
// path from 1to-> 0 -> 4
// path from 2to-> 0 -> 3
// path from 3to-> 0 -> 2 -> 4
// path from 4to-> 1 -> 3