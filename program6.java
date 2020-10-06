

package logicbuilding;
import java.util.Scanner;

public class program6 {
    
    public static void main(String args[])
    {
        System.out.println("Enter the String");
        Scanner scr=new Scanner(System.in);
        String String1=scr.nextLine();
        System.out.println("Enter the 2 String");
        String String2=scr.nextLine();
        
        if(String1.equalsIgnoreCase(String2))
        {
            System.out.print("equals");
        }
        else
        {
            System.out.print("not equals");
        }
    }

}
