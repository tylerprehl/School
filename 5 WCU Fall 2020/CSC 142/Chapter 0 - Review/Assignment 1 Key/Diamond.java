import java.util.*;

public class Diamond{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.print("Enter row number: ");
   int R = kb.nextInt();
   for(int i = 0; i<R-1; i++)
      System.out.print(" ");
   System.out.println("$"); // top line
   for(int i = 0; i<R-1; i++){
      for(int j = 0; j<R-i-2; j++)
         System.out.print(" ");
      System.out.print("$");
      for(int j = 0; j<2*i+1; j++)
         System.out.print(" ");
      System.out.println("$");
   }
   for(int i = 0; i<R-2; i++){
      for(int j = 0; j<i+1; j++)
         System.out.print(" ");
      System.out.print("$");
      for(int j = 0; j<2*(R-i)-5; j++)
         System.out.print(" ");
      System.out.println("$");
   }
   for(int i = 0; i<R-1; i++)
      System.out.print(" ");
   System.out.println("$");
   
}
}