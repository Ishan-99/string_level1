package logicbuilding;
import java.util.Scanner;

public class program_11 {
    
    public static void main(String args[])
    {
        String arr="aeiouAEIOU";
        System.out.println("enter the string");
        Scanner src=new Scanner(System.in);
        String s=src.nextLine();
        String copy="";
        char c;
        int count=0;
        String k="";
        
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(arr.indexOf(c)<0)
            {
                copy+=c;
                count++;
            }
            else
                break;
        }
        
      for(int i=count;i<s.length();i++)
      {
          c=s.charAt(i);
          k=k+c;
      }
       copy=k+copy+"wy";
       System.out.println(copy);
    }

}
