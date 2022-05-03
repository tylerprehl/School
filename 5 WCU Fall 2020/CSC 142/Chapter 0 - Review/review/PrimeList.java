import java.util.*;
public class PrimeList{
   public static void main(String args[]){
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter the start number for the search.");
      int n = kb.nextInt();
      for(int i = 0; i<10; n++ ){
         int j = 2;
         while (n%j!=0) j++;
         if(n==j) {
            i++;
            System.out.println(n);
         }     
      }
   }
}