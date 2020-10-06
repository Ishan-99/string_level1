
package logicbuilding;
import java.util.Scanner;

public class program9 {
    
    public static void main(String args[])
    {
        System.out.println("Enter the String");
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        String copy="";
        char k;
        for(int i=(s.length()-1);i>=0;i--)
        {
            k=s.charAt(i);
            copy+=k;
        }
        
        if(s.equalsIgnoreCase(copy)==true)
            System.out.print("the string is in palindrome");
        else
            System.out.print("the string is not in palindrome");
    }

}
