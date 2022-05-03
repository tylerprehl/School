import java.util.*;
public class Tip{
   public static void main(String args[]){
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter the meal price: ");
      double m = kb.nextDouble();
      double t = m * .15;
      System.out.print("Tip is :");
      if (t> 2)
         System.out.println(t); 
      else  
         if(m>2) 
            System.out.println(2);
         else
            System.out.println(m);    
   }
}