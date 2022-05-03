import java.util.*;

public class SlotM
{
   public static void main(String[]args)
   {
      Random randNum = new Random();
      Scanner kbd = new Scanner(System.in);
      
      //Plays a slot machine game!
      double money = 0; 
      double wonTotal = 0;
      double enteredTotal = 0;
      String reply;
      
      String item;
      String item1 = "";
      String item2 = " ";
      String item3 = "  ";
      
      do
      {
         System.out.print("Enter an amount of money into the slot machine: ");
         money = kbd.nextDouble();
         while (money<0)
         {
            System.out.println("Silly goose! You can't enter NEGATIVE "+
               "money! Try again: ");
            money = kbd.nextDouble();
         }
         enteredTotal=enteredTotal+money;
         
         int count = 0;
         //Randomly selects three words
         for (int i = 1; i<=3; i++)
         {
            int num = randNum.nextInt(6);
            
            switch (num)
            {
               case 0:
                  item = "Cherries";
                  break;
               case 1:
                  item = "Oranges";
                  break;
               case 2:
                  item = "Plums";
                  break;
               case 3:
                  item = "Bells";
                  break;
               case 4:
                  item = "Melons";
                  break;
               case 5:
                  item = "Bars";
                  break;
               default:
                  item = "Cherries"; //because they're the best
                  break;
            }
            System.out.println(item);
            if (i==1)
               item1 = item;
            else if (i==2)
               item2 = item;
            else
               item3 = item;
         }
         if (item1==item2)
            count++;
         if (item1==item3)
            count++;
         if (item2==item3 && item1!=item3)
            count++;
         
         if (count==0)
            System.out.println("You have won $0.");
         if (count==1)
         {
            money*=2;
            wonTotal+=money;
            System.out.println("You have won $"+money+"!");
         }
         if (count==2)
         {
            money*=3;
            wonTotal+=money;
            System.out.println("You have won $"+money+"!!");
         }
      System.out.println("Would you like to play again?");
      kbd.nextLine();
      reply = kbd.nextLine();
      reply = reply.toLowerCase();
      }
      while (reply.equals("yes") || reply.equals("y"));
      
      System.out.println("Total money entered: $"+enteredTotal);
      System.out.println("Total money won: $"+wonTotal);
      double earnings = wonTotal-enteredTotal;
      if (earnings>0)
         System.out.println("Congrats! You won $"+earnings+".");
      else if (earnings==0)
         System.out.println("You did not lose or gain money.");
      else
         System.out.println("Sorry, you lost $"+earnings+".");
      
      System.out.println("Thank you for playing! Come back soon!");
   }
}