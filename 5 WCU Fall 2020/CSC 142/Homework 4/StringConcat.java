import java.util.*;

public class StringConcat
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("You will be asked to enter an endless amount "+
         "of strings to be joined together. When you wish to stop, enter"
         +" \"stop\".");
      
      boolean stopper = true;
      String concat = "";
      
      while (stopper)
      {
         System.out.print("Please enter a string: ");
         String entered = kbd.nextLine();
         if (entered.equalsIgnoreCase("stop"))
         {
            stopper = false;
            concat = concat.substring(0,concat.length()-5);
         }
         else
            concat = concat + entered + " not ";
      }
      System.out.println(concat);
   }
}
      
      