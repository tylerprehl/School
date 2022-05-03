import java.util.*;

public class review3
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      int R = kbd.nextInt();
      for(int i = 1; i < R; i++){ // Q8 i<?
      for(int j = 0; j<i; j++) //Q9 j<?
         System.out.print("$");
      for(int j = 0; j<R*2-i*2-1; j++) //Q10 j<?
         System.out.print(" ");
      for(int j = 0; j<i; j++) // repeat the same in Q9
         System.out.print("$");
      System.out.println();
      }
      for(int i = 1; i<2*R; i++)  //Q11 i<?
         System.out.print("$");
      System.out.println();   
      
     /* 
      //loop that finds first factor that isn't 1
      int n = kbd.nextInt();
      int divisor = 2;
      while (n%divisor!=0)
      {
         divisor++;
      }
      System.out.println(divisor);
      */
      
      //for loop that adds odd numbers <100
      /*
      int num = 0;
      int odd = 1;
      while (odd<100)
      {
         num+=odd;
         System.out.println(num);
         odd+=2;
      }
      System.out.println(num);
      */
      
      // for loop only *loops* first line after for statement w/o braces
      /*
      for (int i=1; i<=10; i++)   
         System.out.println(i);
         System.out.println("finished");
      */
      
      //***exercise 1***
      //int max = -1;
      
      //given while loop
      /*
      int n;
      int c = 0;
      while (c<10)
      {
         n = kbd.nextInt();
         if (n>max)
         {
            max = n;
         }
         c++;
      }
      */
      
      //as a "do-while" loop
      /*
      int x;
      int y = 1;
      do
      {
         x = kbd.nextInt();
         if (x>max)
         {
            max = x;
         }
         y++;
      }
      while (y<=10);
      */
      
      //as a "for" loop
      /*
      int q;
      for (int r=1; r<=10; r++)
      {
         q = kbd.nextInt();
         if (q>max)
         {
            max = q;
         }
      }
      */
      
      //System.out.println(max);
      
      
      //****exercise 2****
      
   }
}