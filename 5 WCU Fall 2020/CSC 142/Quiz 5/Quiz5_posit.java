import java.util.*;
public class Quiz5   {
   /*Question 1
   public static void func(int A[]) {
      for(int i=0;i<A.length;i++)
         A[i]=A[i]+1;
   }
   
   public static void func(int A[], int B[]) {
      for(int i=0;i<A.length;i++)
         B[i]=A[i]+1;
   }
   
   public static int [] func2(int A[]) {
      int [] ret = new int[A.length+1];
      for(int i=0;i<A.length;i++)
         ret[i]=A[i];
      ret[ret.length-1]=ret.length;
      return ret;
   }
   
   public static int func3(int A[]) {
      int ret=0;
      for(int i=0;i<A.length;i++)
         ret = ret+A[i];
      return ret;
   }
   
   public static void main(String[] args) {
      int A[] = {1,2,3};                     //Q1: A[0]=???
      System.out.println(A[0]);              //A1 Printed
      func(A);                               //Q2: A[0]=???
      System.out.println(A[0]);              //A2 Printed
      func(A,A);                             //Q3: A[0]=???
      System.out.println(A[0]);              //A3 Printed
      A=func2(A);
      int x = func3(A);
      System.out.println(x);                 //Q4: x=???    A4: x=
   }
   */
   
   /*Question 2
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);
      int x=kb.nextInt();                    //input 1 for x and 2 for y
      int y=kb.nextInt();
      h(x,y);                                //Q1: x=? y=?
   }                                         //A1: Use 3rd Output (x=1, y=0)
   public static int h(int x, int y)   {
      System.out.println(x+","+y);           //Q2: What is returned with input x=1 y=0?
      if(x==0) return (y+1);                 //A2: either 0 or 1, uncertain
      else if(y==0) return h(x-1,1);
      else return h(x-1,h(x,y-1));           //Q3: How many lines returned?
   }                                         //A3: Either 3 or 6 depending on phrasing (probably 6)
   */
   
   /*Question 3
   public static void main(String[] args) {
      Scanner kb = new Scanner(System.in);   //Q1: x=? y=?
      int x=kb.nextInt();                    //A1: Use 3rd Output (x=1, y=1)
      int y=kb.nextInt();
      h(x,y);                                //Q2: What is returned with input x=1 y=1?
   }                                         //A2: Eh??? 1???????????????????????????????????????????? NANI??????
   public static int h(int x, int y)  {
      System.out.println(x+","+y);           //Q3 How many lines returned?
      if(x==0) return (y+1);                 //A3: Either 3 or 14 depending on phrasing (probably 14)
      else if(y==0) return h(x-1,1);
      else return h(x-1,h(x,y-1));
   }
   */
}