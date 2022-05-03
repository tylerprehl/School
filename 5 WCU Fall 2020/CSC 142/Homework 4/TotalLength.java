import java.util.*;

public class TotalLength
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //get total length of 10 strings that are entered
      int count = 0;
      
      for (int i=1; i<=10; i++)
      {
         System.out.println("Please enter a string: ");
         String input = kbd.nextLine();
         count = count + input.length();
      }
      System.out.println("The total length of the entered strings is "+
         count+"."); 
   }
}