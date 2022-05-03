import java.util.*;

public class Counter
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      //count how many of character (input) there are in the string (input)
      System.out.println("Please enter a string: ");
      String input = kbd.nextLine();
      System.out.println("Please enter a character to search for: ");
      char c = kbd.next().charAt(0);
      int count = 0;
      char letter;
      
      for (int i = 0; i<input.length(); i++)
      {
         letter = input.charAt(i);
         if (c==letter)
            count++;
      }
      System.out.println("There are "+count+" letters \""+c+"\" in "
         +"the entered string."); 
   }
}