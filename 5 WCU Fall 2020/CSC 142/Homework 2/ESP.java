import java.util.*;


public class ESP
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("Enter 10 colors to see how many times you "+
         "can correctly guess the color the computer chose:");
      int correct = 0;
      
      for (int i=1; i<=10; i++)
      {
         Random randNum = new Random();
         
         int num = randNum.nextInt(5);
         String color;
         
         switch (num)
         {
            case 0:
               color = "red";
               break;
            case 1:
               color = "green";
               break;
            case 2:
               color = "blue";
               break;
            case 3:
               color = "orange";
               break;
            case 4:
               color = "yellow";
               break;
            default:
               color = "blue"; //because it's my favorite
               break;
         }
         String guess = kbd.next();
         System.out.println(color);
         if (guess.equalsIgnoreCase(color))
            correct++;
         else
            continue;
      }
      System.out.print("You chose the correct color "+correct+" times.");
   }
}