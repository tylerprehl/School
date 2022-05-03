import java.util.*;

public class Diamond
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //Creates a Diamond of 2R-1 rows

      int R = kbd.nextInt();
      int space = 1;
      
      for (int i=R; i>=1; i--)
      {
         for (int j=1; j<=i-1; j++)
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
         }
         
         if (i==R)
            System.out.print("");
         else
            System.out.print("$");
         System.out.println();
      }
 
      space-=4; 

      for (int i=2; i<=R; i++)
      {
         for (int j=1; j<=i-1; j++)
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
            space = space-2;
         }
         
         if (i==R)
            System.out.print("");
         else
            System.out.print("$");
         
         System.out.println();
      }
   }
}