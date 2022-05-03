import java.util.*;

public class MinMax
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      int[] storage = new int[25];
      int max = kbd.nextInt();
      int min = max;
      storage[0] = max;
      
      for (int i=1; i<25; i++)
      {
         storage[i] = kbd.nextInt();
      }
      
      for (int i=0; i<25; i++)
      {
         if (storage[i]>max)
            max = storage[i];
         else if (storage[i]<min)
            min = storage[i];
      }
      System.out.println("Max input: "+max);
      System.out.println("Minimum input: "+min);
   }
}
      