import java.util.*;

public class Swap
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      // Swaps positions of maximum and minimum numbers entered
      
      int[] myArray = new int[25];
      int max = kbd.nextInt();
      int min = max;
      myArray[0] = max;
      int maxPos=0;
      int minPos=0;
      
      for (int i=1; i<25; i++)
      {
         myArray[i] = kbd.nextInt();
      }

      for (int i=0; i<25; i++)
      {
         if (myArray[i]>max)
         {
            max = myArray[i];
            maxPos = i;
         }
         else if (myArray[i]<min)
         {
            min = myArray[i];
            minPos = i;
         }
      }
      myArray[minPos] = max;
      myArray[maxPos] = min;
      
      System.out.println(Arrays.toString(myArray));
   }
}