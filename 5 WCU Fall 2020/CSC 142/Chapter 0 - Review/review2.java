import java.util.*;

public class review2
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      int cc = kbd.nextInt();
      
      //exercise 1
      if (0<=cc && cc<=30)
         System.out.println("clear");
      else if (31<=cc && cc<=70)
         System.out.println("partly cloudy");
      else if (71<=cc && cc<=99)
         System.out.println("cloudy");
      else if (cc==100)
         System.out.println("overcast");
      else
         System.out.println("Not a percentage out of 100");
         
      //exercise 2 and 3 are pretty much the same, just with other #'s
      
   }
}