

package logicbuilding;
import java.util.Scanner;


public class program_21 {
    
    public static void main(String args[])
    {
        System.out.println("Enter the String:- ");
        Scanner src=new Scanner(System.in);
        String s1=src.nextLine();
        String copy="";
        int l=s1.length();
       
        char k;
        
        for(int i=s1.length()-1;i>=0;i--)
        { 
            k=s1.charAt(i);
            copy+=k;
        }
        
        String[] arr1=s1.split(" ");
        String[] arr2=copy.split(" ");
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i].equalsIgnoreCase(arr2[j]))
                    System.out.println(arr1[i]);
            }
        }
    }
}
