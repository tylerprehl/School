import java.util.*;

public class RightTriangle
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //Creates a Right Triangle
      
      int R = kbd.nextInt();
      
      for (int i=R; i>=1; i--)
      {
         for (int j=1; j<=i; j++)
         {
            System.out.print("$");
         }
         System.out.println();
      }
   }
}