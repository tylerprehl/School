import java.util.*;

public class Quiz4
{
   public static void main(String[]args)
   {
      // #1
      /*
      String s = "hi" + 'r' + "e"; 
      char c = s.charAt(2); 
      c++;
      System.out.println(c);      
      */
      
      
      // #2
      /*
      String t = "123456789"; 
      int x = t.indexOf("456");            //t.index
      String u = t.substring(0,x);         //substring(x,y)
      u = u + "abc" + t.substring(x+3);    //substring(x)
      x = u.indexOf("456");                //u.index, not t.index
      System.out.println(u);
      System.out.println(x);
      */
      
      
      // #3
      /*
      String t = "hedehede";
      int aCount = 0;
      int i=0;
      String s='e'+"d";
      for(; i<=t.length()-s.length(); i++) {
         if(t.substring(i,i+s.length()).equals(s)) {
            aCount++;
          }
      }   
      System.out.println(i);
      System.out.println(aCount);
      */
      
      
      // #4
      /*
      String s = "Ship-at-a-distance";
      String u = "-a";
      String t = "^x";
      int p = s.indexOf(u);
      String result = "";
      while(p>=0) {
        String word = s.substring(0,p);
        result = result + word + t;
         s = s.substring(p+u.length());   
         p = s.indexOf(u); 
      } 
      result = result + s;
      System.out.println(result);
      System.out.println(p);
      System.out.println(s);
      */
      
      
      // #5
      /*
      Scanner kb = new Scanner(System.in);
      String t = kb.nextLine();
      String s = kb.nextLine();
      int c = 0;
      for(int i = 0; i<=t.length()-s.length(); i++)  // Q1?
         if(t.substring(i,s.length()+i).equals(s))  // Q2? 
            c++;
      System.out.println(c);
      */
      
      
      // #6
      /*
      Scanner kb = new Scanner(System.in);
      String t = kb.nextLine();
      String s = kb.nextLine();
      int c = 0;
      int p = t.indexOf(s);
      while (p>=0){
         c++;
         t=t.substring(p+s.length());  //Q3? 
         p=t.indexOf(s);
      }
      System.out.println(c);
      */
      
      
      // #7
      /*
      Scanner kb = new Scanner(System.in);
      String t = kb.nextLine();
      String s = kb.nextLine();
      int c = 0;
      for(int i = 0; i<=t.length()-s.length();  ){ // Q4: ?    Note that it is empty after ";"! 
         if(t.substring(i, i+s.length()).equals(s)){ //Q5: i+?
            c++;
            i+=s.length();  //+= length
         }
         else 
             i++;  //Q6: ? before ;
      }
      System.out.println(c);
      */
   }
}