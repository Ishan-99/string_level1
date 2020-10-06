

package logicbuilding;
import java.util.Scanner;

public class program1 {
    
    void program1()
    {
      System.out.println("enter string");
      Scanner scr=new Scanner(System.in);
      String i=scr.nextLine();
      System.out.println("Your String is:"+i);  
    }
    
    public static void main(String[] args) {
     
        program1 obj=new program1();
        obj.program1();
    }

}
