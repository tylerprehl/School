import java.util.*;

public class OddHollowTriangle{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.print("Enter row number: ");

   int R = kb.nextInt();
   
   
   for(int j = 1; j<=R-1; j++)
      System.out.print(" ");
   System.out.println("$"); // first line
   for(int i = 0; i<=R-2; i++){
      for(int j = 1; j<=R-i-2; j++)
         System.out.print(" ");
      System.out.print("$");
      for(int j = 1; j<=2*i+1; j++)
         System.out.print(" ");
      System.out.println("$");
   }
   
   
   System.out.println("Another way.");
   for(int j = 1; j<R; j++)
      System.out.print(" ");
   System.out.println("$");  // first line
   for(int i = 1; i<R; i++){
      for(int j = 1; j<R-i; j++) // why R-i
         System.out.print(" ");
      System.out.print("$");
      for(int j = 1; j<2*i; j++) // why 2*i
         System.out.print(" ");
      System.out.println("$");
   }
}
}
