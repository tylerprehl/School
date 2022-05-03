public class MyArray {
   private int[] head;
   
   public MyArray()  {
      head = null;
   }
   
   public void add(int a)  {
      if(head==null) {
         int[] hold = {a};
         head = hold;
         return;
      }
      int[] hold = new int[head.length+1];
      for(int i=0;i<head.length;i++)
         hold[i]=head[i];
      hold[hold.length-1] = a;
      head = hold;
   }
   
   public String toString()   {
      if(head==null) return null;
      String s = "["+head[0];
      for(int i=0;i<head.length;i++)
         s = s+", "+head[i];
      return s+"]";
   }
   
   public void remove() {
      if(head==null) return;
      else if(head.length==1) head = null;
      else if(head.length>1)  {
         int[] hold = new int[head.length-1];
         for(int i=0;i<head.length-1;i++)
            hold[i]=head[i+1];
         head = hold;
      }
   }
   
   public String element(int a) {
      if(head==null) return null;
      return ""+head[a];
   }
   
   public boolean add(int a, int b) {
      if(head==null) {
         if(a==0)   {
            int[] hold = {b};
            head = hold;
            return true;
         }
         else return false;
      }
      if(a>head.length) return false;
      int[] hold = new int[head.length+1];
      for(int i=0;i<a;i++)
         hold[i]=head[i];
      hold[a]=b;
      for(int i=a+1;i<hold.length;i++)
         hold[i]=head[i-1];
      head = hold;
      return true;
   }
   
   public void set(int a, int b) {
      if(head==null) return;
      else head[a]=b;
   }
   
   public int indexOf(int a)  {
      if(head==null) return -1;
      for(int i=0;i<head.length;i++)
         if(head[i]==a) return i;
      return -1;
   }
   
   public int size(){
      if(head==null) return 0;
      return head.length;
   }
   
   public void clear()  {
      head=null;
   }
}