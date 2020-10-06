package logicbuilding;
import java.util.Scanner;

public class program_19 
{
    
    public static void main(String args[])
    {
        System.out.println("Enter the srting:- ");
        Scanner src=new Scanner(System.in);
        String s1=src.nextLine();
        char k;
        String copy="";
        s1=" "+s1;
        
        for(int i=0;i<s1.length();i++)
        {
            k= s1.charAt(i);
            if(k==' ')
            {
               k=s1.charAt(i+1);
               k=Character.toTitleCase(k);
              copy=copy+" "; 
               i=i+1;
            }
            copy+=k;
        }
    System.out.println(copy);
    }
}
