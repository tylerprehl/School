import java.util.*;

public class Reverse
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("Enter a string: ");
      String entered = kbd.nextLine();
      String reverseStr = "";
      int index = entered.length() - 1;
      char c;
      while(index>-1)
      {
         c = entered.charAt(index);
         reverseStr = reverseStr+c;
         index--;
      }
      System.out.println(reverseStr);
   }
}