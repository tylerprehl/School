public class Time implements Comparable 
{
   private int hour =0;
   private int minute =0;
   public Time (int h, int m)
   {
      if (h<0||h>23) return;
      if(m<0||m>59) return;
      hour = h;
      minute = m;
   }  
//The above cannot be changed! - I edited the format, but that's all
// Your work starts from here ...
   public int compareTo(Object o)
	{
		if ((o != null) &&
		    (o instanceof Time))
		{
   	   Time otherTime = (Time) o;
         if (hour>otherTime.hour)
            return 1;
         else if (hour==otherTime.hour)
         {
            if (minute>otherTime.minute)
               return 1;
            else if (minute==otherTime.minute)
               return 0;
            else
               return -1;
         }
         else
            return -1;         
		}
	   return -1;
	}
   
   public String toString()
   {
      return "("+hour+", "+minute+")";
   }   
}