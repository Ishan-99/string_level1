

package logicbuilding;
import java.util.Scanner;

public class program2 {
    
    public static void main(String args[])
    {
        Scanner name1=new Scanner(System.in);
        System.out.println("Enter first name");
        String first_name=name1.nextLine();
        System.out.println("Enter Middle name");
        String middle_name=name1.nextLine();
        System.out.println("Enter last name");
        String last_name=name1.nextLine();
        String full_name=" "+first_name+" "+middle_name+" "+last_name;
        System.out.println("Full name is:"+full_name);
    
        System.out.println("Short name: "+first_name.charAt(0)+"."+middle_name.charAt(0)+"."+last_name.charAt(0));
      
    }

}
