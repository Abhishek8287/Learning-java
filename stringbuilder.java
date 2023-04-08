
import java.util.*;

public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");

        System.out.println(sb);

        String s = "tony";
        System.out.println(s);
        //To print character at any index
        System.out.println(sb.charAt(2));
        //To set a character at any index
        sb.setCharAt(0,'A');
        System.out.println(sb);

        //We can also use insert to insert at any index

        sb.insert(2,'P');
        System.out.println(sb);

        //to delete charcter or substring in a string
        sb.delete(2,3);//deleted p 
        System.out.println(sb);

        //to delete a substring
        sb.delete(2 , 4 );
        System.out.println(sb);

        //to append / adding at end

        sb.append("h");
        System.out.println(sb);

        




    }
}
