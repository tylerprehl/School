import java.util.*;

public class Cal
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      double i = kbd.nextDouble();
      double numerator = 1;
      double sum = 0;
      
      while (i>0)
      {
         sum = sum + numerator/i;
         numerator++;
         i--;
      }
      System.out.println(sum);
   }
}
            