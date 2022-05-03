package temperature;
/*
Tyler Prehl
CSC 240
1/5/21
Lab 03 - 1D Arrays
Design and implement static methods to process 1D arrays
*/
import java.util.*;

public class Temperature
{
   public static void main(String[] args)
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int N = kbd.nextInt();
      System.out.println("I will find the average of "+N+
                         " random degrees in the range 60-80\n");
      
      Random rand = new Random();
      int[] temps = new int[N];
      for (int i=0; i<N; i++)
      {
         temps[i] = rand.nextInt(21)+60;
      }
      
      int sum = 0;
      for (int i=0; i<N; i++)
         sum+=temps[i];
      float avg = (float)sum/(float)N;
      
      int count = 0;
      for (int i=0; i<N; i++)
      {
         if (temps[i]>avg)
            count++;
      }
      
      System.out.println("Random degrees: "+Arrays.toString(temps));
      System.out.println("Average temperature: "+avg);
      System.out.println("Degree(s) above average: "+count);
   }
}
