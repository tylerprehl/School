import java.util.*;

public class OddTriangle
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //Creates a Triangle of R rows
      
      int R = kbd.nextInt();
      int length = 1;
      for (int i=R; i>=1; i--)
      {
         for (int j=1; j<=(i-1); j++)
         {
            System.out.print(" ");
         }
         for (int k=1; k<=length; k++)
         {
            System.out.print("$");
         }       
         length = length+2;
         System.out.println();
      }
   }
}