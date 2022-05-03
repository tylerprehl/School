public class CSC142 
{
   public static void main(String [] args)
   {
      int [] g1 = {70, 80, 90};
      int [] g2 = {40, 60, 65, 90};
      Student a = new Student ("Jack", g1);
      Student b = new Student ("Jill", g2);
      System.out.println(a.get_name()+" has an average: " +a.get_average());
      System.out.println(b.get_name()+" has an average: " +b.get_average());
      if(a.compareTo(b)<0) 
         System.out.println(b.get_name()+":"+b+" has a better average.");
      else 
         System.out.println(a.get_name()+":"+a+" has a better average.");   
   }
}