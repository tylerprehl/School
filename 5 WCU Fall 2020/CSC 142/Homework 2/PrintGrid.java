import java.util.*;

public class PrintGrid
{
   public static void main(String[]args)
   {
      //gets row and column specification and creates grid of numbers
      
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("Enter a number of rows: ");
      int rows = kbd.nextInt();
      System.out.println("Enter a number of columns: ");
      int cols = kbd.nextInt();
      int num = 1;
      
      for (int i = 1; i<=rows; i++)
      {
         for (int k = 1; k<=cols; k++)
         {
            System.out.print(num);
            if (k<cols)
               System.out.print(", ");
            num+=rows;
         }
         num = num-(cols*rows)+1;
         System.out.println("");
      }
      
   }
}