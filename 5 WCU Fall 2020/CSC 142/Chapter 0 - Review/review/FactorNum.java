import java.util.*;

public class FactorNum{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter a positive integer: ");
   int n = kb.nextInt();
   int total = 0;
   
   for(int i = 1; i<=n; i++){
        if (n%i==0) total++; 
   }   
   System.out.println(total+" factors");
}
}