
package logicbuilding;
import java.util.Scanner;

public class program_20 {
    
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        System.out.println("enter the String");
        for(int i=0;i>=0;i++)
        {
            String s1=src.nextLine();
            if(s1.length()>5)
            {
               System.out.print(s1);
               break;
            }
            else{
                System.out.print("Enter the string greater than length 5");
            }
        }
    } 

}
