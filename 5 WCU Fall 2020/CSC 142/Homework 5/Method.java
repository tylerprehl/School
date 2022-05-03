import java.util.*;

public class Method
{
   public static void main(String args[])
   {
      System.out.println("result of isEven(3):"+isEven(3));
      displaySquare(3);
      System.out.println("result of isPrime(5):"+isPrime(5));
      
      int [] a ={1,2,3};
      int [] b ={};
      int [] c ={1};
      int [] d = null;
      
      System.out.println(Arrays.toString(md(a)));
      System.out.println(Arrays.toString(md(b)));
      System.out.println(Arrays.toString(md(c)));
      System.out.println(Arrays.toString(md(d)));
      
      
      String e = "abc";
      String f = "a";
      String g = "";
      String h = null;
      
      System.out.println(me(e));
      System.out.println(me(f));
      System.out.println(me(g));
      System.out.println(me(h));
      
   } // end of main
   // develop your (5) methods here:
   public static boolean isEven(int x)
   {
      if (x%2==0)
         return true;
      else
         return false;
   }
   public static void displaySquare(int n)
   {
      for (int i=1; i<=n; i++)
      {
         for (int j=1; j<=n; j++)
            System.out.print("*");
         System.out.println();
      }
   }
   public static boolean isPrime(int n)
   {
      if (n>0)
      {
         for (int i=2; i<n; i++)
         {
            if (n%i==0)
               return false;
            else
            {
               if (i==n-1)
                  return true;
               i++;
            }
         }
      }
      else if (n<0)
      {
         for (int i=-2; i>n; i--)
         {
            if (n%i==0)
               return false;
            else
            {
               if (i==n+1)
                  return true;
            }
         }
      }
      return false;
   }     
   
   public static int[] md(int[] w)
   {
      if (w==null || w.length<=1)
         return null;
      else
      {
         int[] ret = new int[w.length-1];
         for (int i=0; i<ret.length;i++)
         {
            ret[i] = w[i];
         }
         return ret;
      }
   }
   
   public static String me(String w)
   {
      if (w==null || w.length()<=1)
         return null;
      else
      {
         String ret = w.substring(0, w.length()-1);
         return ret;
      }
   }
}
// end of class