import java.util.*;

public class Quiz5_Q1
{
   public static void main(String[]args)
   {
      // quiz 5 question 1
      
      int A[] = {1,2,3};
      //Q1:  A[0]=?
      System.out.println(Arrays.toString(A));
      func(A);
      //Q2:  A[0]=?
      System.out.println(Arrays.toString(A));
      func(A,A);
      //Q3:  A[0]=?
      System.out.println(Arrays.toString(A));
      A = func2(A);
      int x = func3(A);
      //Q4:  x=?
      System.out.println(Arrays.toString(A));
      System.out.println(x);
   }
   public static void func(int A[]) 
   {
      for (int i=0; i<A.length; i++)
         A[i]=A[i]+1;
   }

   public static void func(int A[], int B[]) 
   {
      for (int i=0; i<A.length; i++)
         B[i]=A[i]+1;
   }

   public static int [] func2(int A[]) 
   {
      int [] ret = new int[A.length+1];
      for (int i=0; i<A.length; i++)
         ret[i]=A[i];
      ret[ret.length-1]=ret.length;
      return ret;
   }

   public static int func3(int A[]) 
   {
      int ret = 0;
      for (int i=0; i<A.length; i++)
         ret=ret+A[i];
      return ret;
   }
}