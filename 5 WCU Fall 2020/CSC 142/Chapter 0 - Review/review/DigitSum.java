import java.util.*;

public class DigitSum{
   public static void main(String [] args){
      Scanner kb = new Scanner (System.in);
      int n = kb.nextInt();
      int sum = 0;
      while (n>0){
         sum = n%10;
         n = n/10;
      }
      System.out.println("Sum = "+sum); 
   }
}