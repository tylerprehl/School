public abstract class MyArray implements StringArrayInterface 
{
   private String [] head;
   
   public MyArray()
   {
      head = null;
   }
   
   public MyArray(String [] str)
   {
      if (str==null) 
      {
         head = null; // or head = str;
         return;
      }
      head = new String [str.length]; // deep copy is needed.
      for(int i = 0; i<str.length; i++)
         head[i] = str[i];
   }
   
   public int size()
   {
      if(head==null||head.length==0)
         return 0;
      else
         return head.length;
   }
   
   public abstract String toString();
   // Your development will go here.
   
   public void add(String item)
   {
      if (head==null)
      {
         String [] updated = {item};
         head = updated;
      }
      else
      {
         String [] updated = new String[head.length+1];
         for (int i = 0; i<head.length; i++)
         {
            updated[i] = head[i];
         }
         updated[updated.length-1] = item;
         head = updated;
      }
   }
   
   public String get(int i)
   {
      if (head==null || i>=head.length)
         return null;
      else
         return head[i];
   }
}   