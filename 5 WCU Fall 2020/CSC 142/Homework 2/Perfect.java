import java.util.*;

public class Perfect
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.print("Please enter a number: ");
      int N = kbd.nextInt();
      int sum = 0;
      int divisor = 2;
      
      while (divisor<N)
      {
         while (N%divisor==0)
         {
            sum = sum + divisor;
            System.out.println("Divisor: " + divisor + " " + "Sum: " + sum);
            divisor++;
         }
         divisor++;
      }
      sum++;
      System.out.println("Sum: " + sum);
      if (sum==N)
         System.out.println("This is a perfect number! :)");
      else
         System.out.println("This is not a perfect number. :(");
   }
}