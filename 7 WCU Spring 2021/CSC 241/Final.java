import java.util.*;

public class Final
{
   public static void main(String[]args)
   {
      LinkedList<String> list = new LinkedList<String>();
      list.add(new String("AB"));
      list.add(new String(list.get(0).substring(1)));
      list.add(1 + new String(list.get(1)));
      System.out.println(list);
      
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(new Integer(1));
      q.add(new Integer(2));
      q.add(new Integer(3));
      m(q);
      System.out.println(q);
      
      
      
   }
   public static int m(Queue<Integer> q)
   {
      if (q.isEmpty()) return 0;
      
      int a = q.remove();
      int b = m(q);
      if (a<b) q.add(b);
      return a+b;
   }
}