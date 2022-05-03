import java.util.*;
public class FirstFactor{
public static void main(String args[]){
   Scanner kb = new Scanner(System.in);
   System.out.print("Enter an integer number > 1: ");
   int n = kb.nextInt();
   int i = 2;
   while(n%i!=0)i++;
   System.out.println("First factor is: "+i);
   }
}
