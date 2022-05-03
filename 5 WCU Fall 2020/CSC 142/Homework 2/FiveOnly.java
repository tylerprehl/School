import java.util.*;
import java.io.*;

public class FiveOnly
{
   public static void main(String[]args) throws IOException
   {
      Scanner kbd = new Scanner(System.in);
      System.out.print("Please enter a file name: ");
      String filename = kbd.nextLine();
      
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      for (int i = 1; i<=5; i++)
      {
         if (inputFile.hasNext())
         {
            String line = inputFile.nextLine();
            System.out.println(line);
         }
         else
            System.out.print("");
      }
      
      inputFile.close();
   }
}
         