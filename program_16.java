

package logicbuilding;
import java.util.Scanner;

public class program_16 {
    
    public static void main(String args[])
    {
        String arr="aeiouAEIOU";
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the string s1:- ");
        String s1=src.nextLine();
        System.out.println("Enter the string s2:- ");
        String s2=src.nextLine();
        System.out.println("Enter the string s3:- ");
        String s3=src.nextLine();
        System.out.println("Enter the string s4:- ");
        String s4=src.nextLine();
        System.out.println("Enter the string s5:- ");
        String s5=src.nextLine();
        if(arr.indexOf(s1.charAt(0))>=0)
            System.out.println(s1);
        if(arr.indexOf(s2.charAt(0))>=0)
            System.out.println(s2);
        if(arr.indexOf(s3.charAt(0))>=0)
            System.out.println(s3);
        if(arr.indexOf(s4.charAt(0))>=0)
            System.out.println(s4);
        if(arr.indexOf(s5.charAt(0))>=0)
            System.out.println(s5);
    }

}
