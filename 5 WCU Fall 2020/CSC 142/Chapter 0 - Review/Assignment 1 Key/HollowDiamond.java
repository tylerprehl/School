import java.util.*;

public class HollowDiamond{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.print("Enter row number: ");
   int R = kb.nextInt();
   
   //code for Quiz 1
   int R = kbd.nextInt();
      for(int i = 1; i < R; i++){ // Q8 i<?
      for(int j = 0; j<i; j++) //Q9 j<?
         System.out.print("$");
      for(int j = 0; j<R*2-i*2-1; j++) //Q10 j<?
         System.out.print(" ");
      for(int j = 0; j<i; j++) // repeat the same in Q9
         System.out.print("$");
      System.out.println();
      }
      for(int i = 1; i<2*R; i++)  //Q11 i<?
         System.out.print("$");
      System.out.println();   


   for(int i = 0; i< 2*R-1; i++)
      System.out.print("$"); // top line 
   System.out.println();
   for(int i = 0; i < R-1; i++){
      for(int j = 0; j<R-i-1; j++)
         System.out.print("$");
      for(int j = 0; j<2*i+1; j++)
         System.out.print(" ");
      for(int j = 0; j<R-i-1; j++)
         System.out.print("$");
      System.out.println();
      }
   // upper part R-1 lines
   for(int i = 0; i < R-2; i++){
      for(int j = 0; j<i+2; j++)
         System.out.print("$");
      for(int j = 0; j<2*(R-i)-5; j++)
         System.out.print(" ");
      for(int j = 0; j<i+2; j++)
         System.out.print("$");
      System.out.println();
      }
   // lower part R-2 lines
   for(int i = 0; i< 2*R-1; i++)  // bottom line
      System.out.print("$");
   System.out.println();
   
   System.out.println("Option two:");
   for(int i = 1; i< 2*R; i++)
      System.out.print("$"); // <=2*R-1
   System.out.println();
   for(int i = 1; i < R; i++){  //<=R-1
      for(int j = 1; j<=R-i; j++)
         System.out.print("$");
      for(int j = 1; j<2*i; j++)
         System.out.print(" "); // <=2*i-1
      for(int j = 1; j<=R-i; j++)
         System.out.print("$");
      System.out.println();
      }
   for(int i = 1; i < R-1; i++){ // <=R-2
      for(int j = 1; j<=i+1; j++)
         System.out.print("$");
      for(int j = 1; j<2*(R-i)-2; j++) //<=2(n-i)-3
         System.out.print(" ");
      for(int j = 1; j<=i+1; j++)
         System.out.print("$");
      System.out.println();
      }
   for(int i = 1; i< 2*R; i++)  //<=2R-1
       System.out.print("$");
   System.out.println();   
}
}
