import java.util.*;

public class Quiz3
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      /*
      int [] a = {1, 2, 3};
      int [] b = new int[2];
      int [] c = null;
      int [] d = a;
      b[1] = a[2];              //Q1: b[1]?
      a = b;
      int v = 0;
      for(int i=0; i<a.length; i++)
      {
         v = v + a[i];
      }  // end of for loop
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      System.out.println(Arrays.toString(c));
      System.out.println(Arrays.toString(d));
      System.out.println(v);
      */
      
      System.out.print("Enter the size of array: ");
      int x =kb.nextInt();
      int [] intArr = new int[x];  //Q7
      
      for(x=0; x<intArr.length; x++)
      { 
         System.out.print("Enter element "+(x+1)+": "); 
         intArr[x] = kb.nextInt();
      }
      System.out.println(x);//Q8
      // Accumulate algorithm to find maximum element
      int max = intArr[0];   //Q9
      for(x=1; x<intArr.length; x++) 
      { //Q10
         if(intArr[x] > max) 
         {
            max = intArr[x];
         }
      }
      System.out.println("max = " + max);
   }
}