import java.util.*;

public class Quiz2Scratch
{
   public static void main(String[]args)
   {
      Scanner kb = new Scanner(System.in);
      
      // #1
      /*
      System.out.print("Enter Row: ");
      int R = kb.nextInt();

      int k, x;
   
      k = 1;                                            //Q1 =?
      for(int i=0; i<R; i++,k+=2){ //do both i++ and k=k+2 in update part
         for(int j=1;j<R-k/2;j++){ 
            System.out.print(" ");
         }   
         for(int j=1;j<=k;j++) // k!    
            System.out.print("$");
         System.out.println();
      }
      */
      
      
      // #2
      /*
      System.out.print("Enter Row: ");
   int R = kb.nextInt();

   System.out.print("Enter Column: ");
   int C = kb.nextInt();

   int k, x;
   if(R>C) R=C;  
   for(int i = 0; i<2*C-1; i++)
      System.out.print("$");
   System.out.println();  // first line
   k = C-1;       //Q2    k= C-i, x = i*2-1
   x = 1;       //Q3
   for(int i = 1; i<=R-1; i++){  
      for(int j = 1; j<=k; j++)  
         System.out.print("$");
      for(int j = 1; j<=x; j++) 
         System.out.print(" ");
      for(int j = 1; j<=k; j++) 
         System.out.print("$");
      System.out.println();
      k = C-(i+1);     // Q4
      x = (i+1)*2-1;     // Q5
   }
   */
   
   
   // #3
   /*
   System.out.print("Enter Row: ");
   int R = kb.nextInt();

   System.out.print("Enter Column: ");
   int C = kb.nextInt();

   int k, x;
   if(R>C) R=C;
   k=2*C-2*R+1;          //Q6 ?
   for(int i=0; i<R; i++){
      for(int j=1;j<R-i;j++){  //Q7?  
         System.out.print(" ");
      }   
      for(int j=1;j<=k;j++) // k!    
         System.out.print("$");
      System.out.println();
      k=2*C-2*R+3+i*2; // Q8 ?
   }
   */
   
   
   // #4
   /*
   System.out.print("Enter Row: ");
   int R = kb.nextInt();

   int k;
   k=1;          //Q9 ?
   for(int i=0; i<R-1; i++){ 
      for(int j=1;j<=k;j++){ 
         System.out.print("$");
      }
      for(int j=1;j<2*R-2*i-2;j++)  //Q10?  
         System.out.print(" ");
      for(int j=1;j<=k;j++){ 
         System.out.print("$");
      }   
      System.out.println();
      k=i+2; //Q11
   }
   for(int i = 0; i<2*R-1; i++)
      System.out.print("$");
   System.out.println();
   */
   
   
   // #5
   /*
   System.out.print("Enter Row: ");
   int R = kb.nextInt();

   System.out.print("Enter Column: ");
   int C = kb.nextInt();
   int k, x;
   if(R>C) R=C; 
   k = C-R+1;   // Q12?
   for(int i = 0; i<=R-2; i++){  
      for(int j = 1; j<=k; j++)  
         System.out.print("$");
      for(int j = 1; j<=2*C-2*k-1; j++) // Q13?
         System.out.print(" ");
      for(int j = 1; j<=k; j++) 
         System.out.print("$");
      System.out.println();
      k = C-R+i+2;   // Q14
   }
   for(int i = 0; i<2*C-1; i++)
      System.out.print("$");
   System.out.println();  // last line
   */
   
   }
}  