import java.util.Scanner; 
public class Max3 { 
   public static void main(String[] args) { 
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter 10 integers: ");  
      int x = 0;
      int y = 0;
      int z = 0;
      for (int q = 1; q <= 10; q++) { 
      System.out.print(q + ". ");
      int w = keyboard.nextInt(); 
      if (q == 1) { 
         x = w; 
         y = w; 
         z = w;}
      if ((z == y) && (w < y)) { 
         z = w; }
      if ((y == x) && (w < x)) { 
         y = w; }
      if (x < w) { 
         z = y;
         y = x;
         x = w; } 
      if (x > w) { 
         if (y < w) { 
            z = y; 
            y = w; }
         if ((y > w) && (z < w)) { 
            z = w; ;} }
      } 
      System.out.println("1st Largest: " + x);
      System.out.println("2nd Largest: " + y);
      System.out.print("3rd Largest: " + z);
   } 
}