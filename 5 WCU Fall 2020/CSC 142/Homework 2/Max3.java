import java.util.*;

public class Max3
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("Enter 10 numbers and get the greatest 3.");
      
      int max1 = kbd.nextInt();
      int max2;
      int max3;

      int num = kbd.nextInt();
      if (num>=max1)
      {
         max2 = max1;
         max1 = num;
      }
      else
         max2 = num;
      
      int num2 = kbd.nextInt();
      if (num2>=max2)
      {
         if (num2>=max1)
         {
            max3 = max2;
            max2 = max1;
            max1 = num2;
         }
         else
         {
            max3 = max2;
            max2 = num2;
         }
      }
      else
         max3 = num2;

      for (int i = 1; i<=7; i++)
      {
         int num3 = kbd.nextInt();
         if (num3>=max1)
         {
            max3 = max2;
            max2 = max1;
            max1 = num3;
         }
         else if (num3>=max2)
         {
            max3 = max2;
            max2 = num3;
         }
         else if (num3>=max3)
            max3 = num3;
      }
      System.out.println("The three greatest numbers are: ");
      System.out.println("#1: "+max1);
      System.out.println("#2: "+max2);
      System.out.println("#3: "+max3);
   }
}