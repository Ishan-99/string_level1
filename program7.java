

package logicbuilding;

import java.util.Scanner;

public class program7 {
    
    public static void main(String args[])
    {
        System.out.println("Enter the day");
        Scanner src=new Scanner(System.in);
        String day=src.nextLine();
       
            if (day.equalsIgnoreCase("monday"))
                System.out.println("monday:-"+1);
        
            else if(day.equalsIgnoreCase("tuesday"))
                System.out.println("tuesday:-"+2);
        
            else if(day.equalsIgnoreCase("wednesday"))
                System.out.println("Wednesday:-"+3);
            
            else if (day.equalsIgnoreCase("thrusday"))
                System.out.println("thrusday:-"+4);
             
            else if (day.equalsIgnoreCase("friday")) 
                System.out.println("friday:-"+5);
               
            else if(day.equalsIgnoreCase("saturday"))
                System.out.println("saturday:-"+6);
               
            else if(day.equalsIgnoreCase("sunday"))
                System.out.println("sunday:-"+7);
               
            else
                System.out.println("invalid input");
        }
    }
