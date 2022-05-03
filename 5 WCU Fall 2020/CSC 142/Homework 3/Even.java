import java.util.*;

public class Even
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //Tells you if there is an even number of even numbers in the array
      
      int[] myArray = new int[25];
      int count=0;
      
      for (int i=0; i<25; i++)
      {
         myArray[i] = kbd.nextInt();
      }
      
      for (int i=0; i<25; i++)
      {
         if (myArray[i]%2==0)
         {
            count++;
         }
         else 
            continue;
      }
      if (count%2==0)
         System.out.println("True! There is an even number of even numbers!");
      else
         System.out.println("False, there was no even number in the arrary");
   }
}