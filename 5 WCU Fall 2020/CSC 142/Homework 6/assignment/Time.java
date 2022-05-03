public class Time
{
   private int hour;
   private int minute;
   
   public Time()
   {
      hour = 0;
      minute = 0;
   }
   
   public boolean isValid(int hour, int minute)
   {
      if (hour>=0 && hour<=11 && minute>=0 && minute<=59)
         return true;
      else
         return false;
   }
   
   public void setTime(int hour, int minute, boolean isAm)
   {
      if (isAm)
      {
         this.hour = hour;
         this.minute = minute;
      }
      else
      {
         if (hour==12)
         {
            this.hour = hour;
            this.minute = minute;
         }
         this.hour = hour+12;
      }
   }
   
   public int compareTo(Time x)
   {
      if (hour>x.getHour())
         return 1;
      else if (hour==x.getHour())
      {
         if (minute>x.getMinute())
            return 1;
         else if (minute==x.getMinute())
            return 0;
         else if (minute<x.getMinute())
            return -1;
      }
      return -1;
   }
   
   public int getHour()
   {
      return hour;
   }
   public int getMinute()
   {
      return minute;
   }
   public String toString()
   {
      return hour+":"+minute;
   }
}