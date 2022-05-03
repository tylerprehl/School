import java.util.*;

public class Sum
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.println("Please enter a positive number.");
      int num = kbd.nextInt();
      int sum = 0;
      int digit;
      
      while (num<0)
      {
         System.out.println("Please enter a positive number.");
         num = kbd.nextInt();
      }
      while (num>0)
      {
         digit = num%10;
         sum = sum + digit;
         num = num/10;
      }
      System.out.print(sum);
   }
}
         