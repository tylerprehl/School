package arraysstaticmethodsdemo;
/*
Tyler Prehl
CSC 240-01
1/5/21
Lab 03 - 1D Arrays
Design and implement static methods to process 1D arrays
*/
import java.util.Scanner;

class ArraysStaticMethods
{  
   public static int[] readInputs()
   {
      System.out.print("What length is the array? ");
      Scanner kbd = new Scanner(System.in);
      int length = kbd.nextInt();
      int[] input = new int[length];
      for (int i=0; i<length; i++)
      {
         System.out.print("Enter an integer: ");
         input[i] = kbd.nextInt();
      }
      return input;
   }
   
   public static void swap(int[] array)
   {
      int max=array[0];
      int maxPos=0;
      int min=array[0];
      int minPos=0;
      for (int i=1; i<array.length; i++)
      {
         if(array[i]>max)
         {
            max=array[i];
            maxPos = i;
         }
         else if(array[i]<min)
         {
            min=array[i];
            minPos = i;
         }
      }
      array[maxPos] = min;
      array[minPos] = max;
   }
   
   public static boolean even(int[] array)
   {
      int count = 0;
      for (int i=0; i<array.length; i++)
      {
         if (array[i]%2==0)
            count++;
      }
      if (count%2==0)
         return true;
      else
         return false;
   }
   
   public static String displayOutputs(int[] array)
   {
      // I considered using java.util.Arrays to do a quick toString, but
      // thought it might not be what you wanted so I crafted my own
      String str = "[";
      for(int i=0; i<array.length-1; i++)
         str += array[i]+", ";
      str += array[array.length-1]+"]";
      return str;
   }
}

public class ArraysStaticMethodsDemo
{
   public static void main(String[] args)
   {
      int[] array = ArraysStaticMethods.readInputs();
      System.out.println();
      System.out.println("The array before: "+
                         ArraysStaticMethods.displayOutputs(array));
      System.out.println("Does the array contain an even number of evens? "+
                         ArraysStaticMethods.even(array));
      ArraysStaticMethods.swap(array);
      System.out.println("The array after swap: "+
                         ArraysStaticMethods.displayOutputs(array));
   }
}
