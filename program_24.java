

package logicbuilding;
import java.util.Scanner;

public class program_24 {
    
    public static void main(String args[])
    {
        Scanner src=new Scanner(System.in);
        String country[]={"china","Rio de janerio","peru","me*ico","rome","India","jordan"};
        String wonder[]={"The great wall of china","christ the redeemer statue","machu picchu","chichen itja","the roman colosseum","taj mahal","petra"};

        System.out.println("enter the place you want to get wonder:- ");
        String k=src.nextLine();
        int flag=0;
        
        for(int j=0;j<7;j++)
        {
            if(country[j].equalsIgnoreCase(k)==true)
                System.out.println(wonder[j]);
                flag=1;
        }
        if(flag==0)
            System.out.println("no such element the array contains.");  
    }
}
