import java.util.*;

public class Homework4_WordDocWork
{
   public static void main(String[]args)
   {
      //1
      
      String s = "hello"; 
      char c = s.charAt(2); 
      c++; 				   //char +, +1, ++
      s = "he" + c + c + "o";       //String +
      System.out.println(s);
      
      
      
      //2
      /*
      String t = "hee dee hee dee hee dee hee"; 
      int x = t.indexOf("dee");    // indexOf(str)
      String u = t.substring(0,x); // substring(x, y)
      u = u + "haw";
      x = t.indexOf("dee");        //second call of indexOf(str)
      System.out.println(x +"\n"+u);
      */
      
      
      //3
      /*
      String s = "hi dee hi dee hi";  // find four blank space first!
      String t = "";
      int x = s.indexOf("hi dee", 0);   // indexOf(str, x)
      while(x>=0) 
      {
      	t = t + "ho dee";
      	x = s.indexOf("hi dee", x+1);  // indexOf(str, x)
      }
      t = t + "ho";
      System.out.println(t+"\n"+x);
      */
      
      
      //4
      /*
      String s = "hibbity" + "hibbity";
      int i=0;
      int count = 0;
      while(i<s.length()-3) {   // length() - 14-3=11
      	if(s.substring(i,i+3).equals("bit")) //substring(x,y), equals(str)
         { 
      		count++;
      	}
      	i++;
      }
      System.out.println(count+"\n"+i);
      */
      
      
      //5
      /*
      String s;
      String t = null;
      String u = "you";
      String v = new String("me");  // compare u and v!
      String w = u + v;
      System.out.println(t+"\n"+u+"\n"+v+"\n"+w);
      */
      
      
      //6
      /*
      String s = "Call me Ishmael!";
      int len = s.length();                         //length()
      int ishPos = s.indexOf("Ish");        //indexOf(str)
      int jackPos = s.indexOf("Jack");    // another indexOf(str)
      String ishSub = s.substring(ishPos);  //substring(x)!!!
      char c = s.charAt(ishPos);            // charAt(x)
      System.out.println(ishPos+"\n"+jackPos+"\n"+ishSub+"\n"+c+"\n"+len);
      */
      
      
      //7
      /*
      String s = "It was a cold day!";
      int start = s.indexOf("cold");         //indexOf(str)
      int end = start + "cold".length();    //length()
      s = s.substring(0, start)                  //substring(x,y)
        + "hot"
        + s.substring(end);		      //substring(x)!
      System.out.println(s+"\n"+start+"\n"+end);
      */
      
      
      //8
      /*
      String s = "Call me Ishmael!";
      int aCount = 0, i = 0;
      char c = 0;
      for( ; i<s.length(); i++) {  //length()
         c = s.charAt(i);          //charAt(int)
         if(c == 'a') 
         {
            aCount++;
         }
      }
      System.out.println(aCount+"\n"+c);
      */
      
      
      //9
      /*
      String s = "Ships at a distance have every man's wish.";
      int spacePos1 = 0;
      int spacePos2 = s.indexOf(" ");  //indexOf(“<space>”)
      String hyphenated = "";           //empty string
      while(spacePos2>=0) 
      {
         String word = s.substring(spacePos1,spacePos2);//substring(x, y)
         hyphenated = hyphenated + word + "-";
         spacePos1 = spacePos2 + 1;
         spacePos2 = s.indexOf(" ", spacePos1);      //indexOf(str, x)
      }
      if(spacePos1<s.length()) 
      {
         hyphenated = hyphenated + s.substring(spacePos1); //substring(x)!
      }
      System.out.println(spacePos1+"\n"+spacePos2+"\n"+hyphenated);
      */
   }
}
