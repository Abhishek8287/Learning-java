import java.util.*;

   
        public class second {
            public static void main(String[] args) {
                int[] elements = {4, 3, 7, 2, 5};
        
                for (int i = 0; i < elements.length; i++) {
                    int count = countVisibleElements(elements, i);
                    System.out.println("Element " + elements[i] + " can see " + count + " elements.");
                }
            }
        
            // Function to count the number of elements an element can see in the array
            static int countVisibleElements(int[] elements, int index) {
                int count = 0;
        
                for (int i = index + 1; i < elements.length; i++) {
                    if (elements[i] > elements[index]) {
                        count++;
                    } else {
                        continue;
                    }
                }
        
                return count;
            }
        }
        

