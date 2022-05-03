import java.util.*;

public class OddHollowTriangle
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //Creates a Hollow Triangle of R rows
      int R = kbd.nextInt();
      int space = 1;
      
      for (int i=R; i>=1; i--)
      {
         for (int j=1; j<=(i-1); j++)
         {
            System.out.print(" ");
         }
         System.out.print("$");
         
         if (i==R)
            System.out.print("");
         else
         {
            for (int k=1; k<=space; k++)
            {
               System.out.print(" ");
            }
            space = space+2;
            System.out.print("$");
         }
         System.out.println();
      }
   }
}