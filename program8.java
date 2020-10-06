

package logicbuilding;
import java.util.Scanner;

public class program8 {
    
    public static void main(String args[])
    {
        System.out.println("Enter string: ");
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        String copy="";
        char k;
        for (int i=0;i<s.length();i++)
        {
            k=s.charAt(i);
            if(java.lang.Character.isUpperCase(s.charAt(i))==true)
            {
                k=Character.toLowerCase(k);
                copy+=k;
            }
            else{
                k=Character.toUpperCase(k);
                copy+=k;
            }
        }
        System.out.print(copy);
        
    }

}
