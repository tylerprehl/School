public class Friends extends MyArray
{
   public Friends ()
   {
      super();
   }
      
   public static void main(String [] args)
   {
      Friends r = new Friends();
      System.out.println(r);
      r.add("Smith");
      System.out.println("get(1) after one friend is added:" + r.get(1));
      r.add("Karen");
      System.out.println("get(1) after another friend is added:" + r.get(1));
      System.out.println("Now: "+r);
   }
   // Your development will go here.
   public String toString()
   {
      if (size()==0)
         return "[null]";
      else
      {
         String str = "[";
         for (int i = 0; i<size(); i++)
         {
            if (i==size()-1)
               str += get(i);
            else
               str += get(i)+", ";
         }
         return str+"]";
      }
   }
}