import java.util.*;

public class review1
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      int g = kbd.nextInt();
      
      //exercise 3 (ex 4 is the same except w/o 0 and 100)
      
      if (0<=g && g<=1100)
         System.out.println("Yes");
      else
         System.out.println("No");
      
         
      //exercise 5 (can be done with "or" in first statment or "else if")
      /*
      if (0<=g && g<=100 || 300<=g && g<=400)
         System.out.println("yes");
      else
         System.out.println("no");
      */
      
      //exercise 6
      /*
      if (0<=g && g<=400)
         if (100<=g && g<=300)
            System.out.println("No");
         else
            System.out.println("Yes");
      else
         System.out.println("No");
      */
   }
}