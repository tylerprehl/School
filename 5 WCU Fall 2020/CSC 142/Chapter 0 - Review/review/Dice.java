import java.util.*;
public class Dice{
public static void main(String args[]){
   Random r = new Random();
   int start = 1;
   int end = 6;
   int key = r.nextInt(end-start+1)+start;
   System.out.print(key);
}
}