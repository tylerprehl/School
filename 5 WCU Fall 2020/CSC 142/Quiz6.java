import java.util.*;

public class Quiz6
{
   public static void updateN(int x)
   {
      x = x + 2;
   }
   
   public static void updateM(String x)
   {
      x = x + 2;
   }
   
   public static void main(String[]args)
   {
      // #1
      int x = 2;
      updateN(x);
      System.out.println(x);
      
      // #2 
      String y = "1";
      updateM(y);
      System.out.print(y);
   }
}

// #3
/*public class Mystery
{

   private int x;

   public Mystery ()
   {
      x = 1;
   }

   public void update(int y)
   {
      x = x + y;
   }

   public String toString()
   {
      return ""+x;
   }
   public static void main(String[]args)
   {
      Mystery x = new Mystery();
      x.update(2);
      System.out.println(x);
   }
}*/

// #4
/*public class Mystery
{

   private int x;

   public Mystery ()
   {
      x = 1;
   }

   public void update(int x)
   {
      this.x = x;
   }

   public String toString()
   {
      return ""+x;
   }
   
   public static void main(String[]args)
   {
      Mystery x= new Mystery ();
      x.update(2);
      System.out.println(x);
   }
}*/

// #5
// public Adder()

// #6
// public Adder(int x)

// #7
// public void add()

// #8
// public int add()