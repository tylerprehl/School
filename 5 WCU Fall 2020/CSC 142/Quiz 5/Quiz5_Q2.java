import java.util.*;

public class Quiz5_Q2
{
   public static void main(String[]args)
   {
      // quiz 5 questions 2 & 3
      
      // q2
      h(1,2);
      
      System.out.println();
      
      // q3
      h(2,1);
   }
   public  static int h(int x, int y)
   {
      System.out.println(x+","+y);
      if (x==0) 
         return (y+1);
      else if (y==0) 
         return h(x-1, 1);
      else 
         return h(x-1, h(x,y-1));
   }
}