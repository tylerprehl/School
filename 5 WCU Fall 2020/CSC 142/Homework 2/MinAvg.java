import java.util.*;

public class MinAvg
{
   public static void main(String[]args)
   {
      //gets minimum number and mean from 10 entered numbers
      
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("Enter 10 numbers: ");
      int min = kbd.nextInt();
      double total = 0;
      
      for (int i = 1; i<=9; i++)
      {
         int num = kbd.nextInt();
         total+=num;
         if (num<min)
            min = num;
      }
      double avg = total/10;
      System.out.println("The minimum was " + min);
      System.out.print("The average is " + avg);
   }
}