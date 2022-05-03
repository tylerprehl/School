import java.util.*;

public class RightHollowTriangle{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.print("Enter row number: ");
   int R = kb.nextInt();
   
   for(int i=1; i<=R; i++)
   {
      for(int j=0; j<R-i; j++)
      {
         System.out.print(" ");
      }
      System.out.println("$");
   }
   /*
   for(int i = 0; i<R; i++){
      for(int j = 0; j<R-i-1; j++)
         System.out.print(" ");
      System.out.println("$");
   }
   System.out.println("Another way.");
   for(int i = 1; i<=R; i++){
      for(int j = 1; j<=R-i; j++)
         System.out.print(" ");
      System.out.println("$");
   */
   
}
}