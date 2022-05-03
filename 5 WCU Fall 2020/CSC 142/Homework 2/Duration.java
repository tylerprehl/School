import java.util.*;

public class Duration
{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      
      System.out.println("Please enter time as military time.");

      System.out.print("Enter current hour: ");
      int nowHour = kbd.nextInt();
      System.out.print("Enter current minute: ");
      int nowMin = kbd.nextInt();
      while (nowHour<0 || nowHour>23 || nowMin<0 || nowMin>59)
      {
         System.out.println("Please re-enter the current time.");
       
         System.out.print("Enter current hour: ");
         nowHour = kbd.nextInt();
         System.out.print("Enter current minute: ");
         nowMin = kbd.nextInt();
      }
      int nowTime = nowHour*60 + nowMin;
      
      System.out.print("Enter meeting hour: ");
      int meetHour = kbd.nextInt();
      System.out.print("Enter meeting minute: ");
      int meetMin = kbd.nextInt();
      while (meetHour<0 || meetHour>23 || meetMin<0 || meetMin>59)
         {
            System.out.println("Please re-enter the meeting time.");
         
            System.out.print("Enter meeting hour: ");
            meetHour = kbd.nextInt();
            System.out.print("Enter meeting minute: ");
            meetMin = kbd.nextInt();
         } 
      int meetTime = meetHour*60 + meetMin;
      
      while (nowTime>meetTime)
      {
         System.out.println("The meeting time is before the current ");
         System.out.println("time - either you're late or you typed ");
         System.out.println("in the wrong times. Would you like to ");
         System.out.println("re-enter the times? Enter \"yes\" or ");
         System.out.print("\"no\": ");
         String reply = kbd.next();
         if (reply.equalsIgnoreCase("no"))
            System.exit(0);
         else if (reply.equalsIgnoreCase("yes"))
         {
            System.out.print("Enter current hour: ");
            nowHour = kbd.nextInt();
            System.out.print("Enter current minute: ");
            nowMin = kbd.nextInt();
            while (nowHour<0 || nowHour>23 || nowMin<0 || nowMin>59)
            {
               System.out.println("Please re-enter the current time.");
            
               System.out.print("Enter current hour: ");
               nowHour = kbd.nextInt();
               System.out.print("Enter current minute: ");
               nowMin = kbd.nextInt();
            }
            nowTime = nowHour*60 + nowMin;
         
            System.out.print("Enter meeting hour: ");
            meetHour = kbd.nextInt();
            System.out.print("Enter meeting minute: ");
            meetMin = kbd.nextInt();
            meetTime = meetHour*60 + meetMin;
            
            while (meetHour<0 || meetHour>23 || meetMin<0 || meetMin>59)
            {
               System.out.println("Please re-enter the meeting time.");
            
               System.out.print("Enter meeting hour: ");
               meetHour = kbd.nextInt();
               System.out.print("Enter meeting minute: ");
               meetMin = kbd.nextInt();
            } 
         }
         else
            System.out.println("Invalid input");
      }  

      int timeLeft = meetTime - nowTime;
      int minLeft = timeLeft%60;
      int hourLeft = timeLeft/60;
      
      if (hourLeft>=10 && minLeft<10)
         System.out.println("You have "+hourLeft+":0"+minLeft+
            " left before your meeting.");
      else if (hourLeft<10 && minLeft>=10)
         System.out.println("You have 0"+hourLeft+":"+minLeft+
            " left before your meeting.");
      else if (hourLeft<10 && minLeft<10)
         System.out.println("You have 0"+hourLeft+":0"+minLeft+
            " left before your meeting.");
      else
         System.out.println("You have "+hourLeft+":"+minLeft+
            " left before your meeting.");
   }
}