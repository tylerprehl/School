import java.util.*;

public class RightHollowTriangle
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //Creates a diagonal line of "$"
      
      int R = kbd.nextInt();
      
      for (int i=R; i>=1; i--)
      {
         for (int j=1; j<=(i-1); j++)
         {
            System.out.print(" ");
         }
         System.out.print("$");
         System.out.println();
      }
   }
}