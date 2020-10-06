

package logicbuilding;
import java.util.Scanner;

public class program3 {
    
    public static void main(String args[])
    {
        System.out.println("Enter the String");
        Scanner scr=new Scanner(System.in);
        String i=scr.nextLine();
        int count=0;
        for (int j=0;j<i.length();j++)
        {   
            int k=i.charAt(j);
            if((k>=65) && (k<=90))
            {
                count++;
            }
        }
        System.out.print(count);
    }

}
