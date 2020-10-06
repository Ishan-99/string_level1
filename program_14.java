
package logicbuilding;
import java.util.Scanner;


public class program_14 {
    
    public static void main(String args[])
    {
        
        String s1="15 august is our independence day";
        s1=s1.replaceAll("15 august","26 january");
        s1=s1.replaceAll("independence","republic");
        System.out.print(s1);
    }

}
