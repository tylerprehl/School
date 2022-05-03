import java.util.*;

public class Counting
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //count how many "S" and "s" there are in the input string
      System.out.println("Please enter a string: ");
      String input = kbd.nextLine();
      int count = 0;
      char c;
      
      for (int i = 0; i<input.length(); i++)
      {
         c = input.charAt(i);
         if (c=='s' || c=='S')
            count++;
      }
      System.out.println("There are "+count+" letters \"s/S\" in "
         +"the entered string."); 
   }
}