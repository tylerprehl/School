public class FinalExam
{
   public static void main(String[]args)
   {
      try
      {
         System.out.println("Welcome to java");
         int i = 0;
         int y = 2/i;
         System.out.println("Welcome to java");
      }
      catch (RuntimeException ex)
      {
         System.out.println("Welcome to Java");
      }
      finally
      {
         System.out.println("End of the block");
      }
      System.out.println("End of the block");
   }
}