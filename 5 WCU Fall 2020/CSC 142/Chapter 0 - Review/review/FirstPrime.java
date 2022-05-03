import java.util.*;
public class FirstPrime{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter how many prime numbers in request: ");
   int i = kb.nextInt();
   int n = 2;
   for(int c = 0; c < i; n++){
      int j = 2; 
      for(; n%j!=0; j++);
      if (n==j) {
         System.out.println(j);
         c++;
      }
   } 
}
}