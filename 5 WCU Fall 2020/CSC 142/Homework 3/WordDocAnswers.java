import java.util.*;

public class WordDocAnswers
{
   public static void main(String[]args)
   {
      //1
      /*
      int [] x = new int[3];
      int [] y = {1, 3, 5, 9};
      x[2] = y[3];
      x[0]++;
      y[1] += y[2] - y[0];
      int [] z = x;
      x = y;
      x[1] = 4;
      */
      
      //2
      /*
      int [] x = new int[0];
      int [] y = {};
      int [] z = {0};
      */

      //3 
      /*
      int [] x = {-4, 3, 8, 2, -5, 1};
      for(int i=1; i<x.length; i++) 
      {
         x[i] += x[i-1]; // notice:  += instead of =
      }
      */
      
      //4
      
      int [] x = {-4, 3, 8, 2, -5, 1};
      for(int i=1; i<x.length; i++) 
      {
         x[i] = x[i-1];  
      }
      
      
      System.out.println(Arrays.toString(x));
      //System.out.println(Arrays.toString(y));
      //System.out.println(Arrays.toString(z));
   }
}