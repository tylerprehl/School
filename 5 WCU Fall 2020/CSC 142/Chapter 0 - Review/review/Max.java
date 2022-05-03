import java.util.*;
public class Max{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter integer 1: "); 
   int n = kb.nextInt();
   int max = n;
   for(int i = 2; i<=10; i++){
      System.out.println("Enter integer "+i+" : "); 
      n = kb.nextInt();
      if (n > max) max = n;
   }
   System.out.println("The maximum is: "+max);
       
}
}