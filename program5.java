

package logicbuilding;
import java.util.Scanner;

public class program5 
{
    public static void main(String args[])
    {
        System.out.println("enter the string");
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        int count=0;
        if(s.length()>0)
        {
            count=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                count++;
            }
        }
            System.out.print("total no. of words"+count);
        }
        else{
            System.out.println("Total no. of words"+count);
        }
    }

}
