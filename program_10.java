package logicbuilding;
import java.util.Scanner;

public class program_10 {
    
    public static void main(String args[])
    {
        System.out.println("enter the string:- ");
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        System.out.print("Substring will be:- ");
        for(int i=0;i<s.length();i++)
        {
            if(i>=3)
            {
                System.out.print(""+s.charAt(i));
            }
        }
        
    }

}
