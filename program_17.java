
package logicbuilding;
import java.lang.String;
import java.util.Scanner;


public class program_17 {
    
    public static void main(String args[])
    {
        System.out.println("Enter the string:- ");
        Scanner src=new Scanner(System.in);
        String s1=src.nextLine();
        String k="";
        
        for(int i=0;i<s1.length();i++)        
        {
           if(i%2==0)
               k+=Character.toUpperCase(s1.charAt(i));
           else
               k+=Character.toLowerCase(s1.charAt(i));
        }
        System.out.print(k);
    }
}
