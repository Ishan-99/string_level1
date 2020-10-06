

package logicbuilding;
import java.util.Scanner;

public class program4 {
    public static void main(String args[])
    {
        String arr="aeiouAEIOU";
        System.out.println("Enter the String");
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char k=s.charAt(i);      
            if(arr.indexOf(k)>=0)
            {
                count++;
            }
        }
        System.out.print(count);
    }

}
