public class MyArray
{
   private int[] head;
   
   public MyArray()
   {
      head = null;
   }
  
   public void add(int n)
   {
      if (head==null)
      {
         int[] hold = {n};
         head = hold;
         return;
      }
      int[] hold = new int[head.length+1];
      for (int i=0; i<head.length; i++)
         hold[i] = head[i];
      hold[hold.length-1] = n;
      head = hold;
   }
   
   public String toString()
   {
      if (head==null)
         return null;
      String s = "["+head[0];
      for (int i=1; i<head.length; i++)
         s = s+", "+head[i];
      return s+"]";
   }
   
   public void remove()
   {
      if (head==null)
         return;
      else if (head.length==1)
         head = null;
      else if (head.length>1)
      {
         int[] hold = new int[head.length-1];
         for (int i=0; i<hold.length; i++)
            hold[i] = head[i+1];
         head = hold;
      }
   }
   
   public String element(int index)
   {
      if (head==null)
         return null;
      return ""+head[index];
   }
   
   public boolean add(int index, int n)
   {
      if (head==null)
      {
         if (index==0)
         {
            int[] hold = {n};
            head = hold;
            return true;
         }
         else
            return false;
      }
      if (index>head.length)
         return false;
         
      int[] hold = new int[head.length+1];
      for (int i=0; i<index; i++)
         hold[i] = head[i];
      hold[index] = n;
      for (int i=index+1; i<hold.length; i++)
         hold[i] = head[i-1];
      head = hold;
      return true;
   }
      
   public void set(int index, int n)
   {
      if (head==null)
         return;
      else
         head[index] = n;
   }
   
   public int indexOf(int n)
   {
      if (head==null)
         return -1;
      for (int i=0; i<head.length; i++)
      {
         if (head[i]==n)
            return i;
      }
      return -1;
   }
      
   public int size()
   {
      if (head==null)
         return 0;
      return head.length;
   }
   
   public void clear()
   {
      head = null;
   }
}