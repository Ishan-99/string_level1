

package logicbuilding;
import java.util.Scanner;

public class program_12 {
    
    public static void main(String args[])
    {
        System.out.println("enter the String");
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        if(s.equalsIgnoreCase("mr."))
            System.out.println("male");
        else if(s.equalsIgnoreCase("miss.")||(s.equalsIgnoreCase("kumari")))
            System.out.println("female");
        else if(s.equalsIgnoreCase("mrs."))
            System.out.println("married female");
        else
            System.out.print("cannot determine");
    }

}
