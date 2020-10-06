

package logicbuilding;
import java.util.Scanner;

public class program_13 {
    
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter String 1:- ");
        String s1=src.nextLine();
        System.out.println("Enter String 2:- ");
        String s2=src.nextLine();
           
        int k=s1.compareToIgnoreCase(s2);
        if(k>0)
            System.out.print("s2 comes first than s1");
        else if(k==0)
            System.out.print("they both are equal");
        else
            System.out.print("s1 comes first than s2");
    }

}
