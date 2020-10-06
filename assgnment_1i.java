
package logicbuilding;
import java.util.Scanner;

public class assgnment_1i {

    public static void main(String args[])
    {
        try{
             Scanner src=new Scanner(System.in);
             System.out.println("Enter a");
             int a=src.nextInt();
             System.out.println("Enter b");
             int b=src.nextInt();
             System.out.println("The sum is : "+(a+b));
          }
        
        catch (Exception e){
            System.out.println("Invalid input");
        }
    }
}
