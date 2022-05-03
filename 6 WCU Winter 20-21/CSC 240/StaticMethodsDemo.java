package newpackage;
/*
Tyler Prehl
12/18/20
CSC 240-01
Lab 02
Complete the methods provided to have the main run as intended by
the given instructions
*/



import java.util.Random;

class StaticMetohdsDemo {

    // Marco for counting the methods
    static int N = 1;

    public static void main(String[] args) {
        spacer();
        System.out.println(countsGuests("Jason", 3));
        spacer();
        alarm(4);
        spacer();
        System.out.println(sum100());
        spacer();
        System.out.println(maxOfTwo(5, 8));
        spacer();
        System.out.println(sumRange(3, 10));
        spacer();
        System.out.println(larger(2.5, 9.2));
        spacer();
        System.out.println(countA("Apples are amazing!"));
        spacer();
        System.out.println(evenlyDivisible(2, 4));
        spacer();
        System.out.println(average(4, 5));
        spacer();
        System.out.println(average(2, 4, 6));
        spacer();
        System.out.println(average(2, 4, 6, 8));
        spacer();
        System.out.println(average(2, 4, 6, 8, 10));
        spacer();
        System.out.println(multiConcat("Hello", 5));
        spacer();
        System.out.println(isAlpha('A'));
        spacer();
        System.out.println(reverse("Fishsticks"));
        spacer();
        System.out.println(isIsoceles(3, 7, 12));
        spacer();
        System.out.println(randomInRange(10, 100));
    }

    /*
     * Pre: Give method a name and an integer
     * Post: returns a welcome message
     */
    public static String countsGuests(String visitorName, int visitorNumber) {
       String str = "Welcome "+visitorName+"! You are visitor #"+visitorNumber+".";
       return str;
    }

    /*
     * Pre: Give method an integer
     * Post: prints "Alarm!" (given integer) number of times; prints
             error message if integer is <1
     */
    public static void alarm(int number) {
        if (number<1)
        {
           System.out.println("Error: # input is < 1");
           return;
        }
        for (int i = 0; i<number; i++)
        {
           System.out.println("Alarm!");
        }
    }

    /*
     * Pre: no paramters - nothing to give method
     * Post: sums numbers from 1 to 100 (inclusive)
     */
    public static int sum100() {
      int sum = 0;
      for (int i = 1; i<=100; i++)
      {
         sum+=i;
      }
      return sum;
    }

    /*
     * Pre: give two integers 
     * Post: returns the greater of the two
     */
    public static int maxOfTwo(int x, int y) {
       if (x>=y)
         return x;
       else
         return y; 
    }

    /*
     * Pre: give two integers
     * Post: if second int is less than first, show error messsage and return 0,
             otherwise, returns sum of integers in the range (inclusive)
     */
    public static int sumRange(int x, int y) {
        if (y<x)
        {
           System.out.println("Error: the second integer entered was less "+
                              "than the first");
           return 0;
        }
        else
        {
           int sum = 0;
           for (int i = x; i<=y; i++)
           {
              sum += i;
           }
           return sum;
        }
    }

    /*
     * Pre: give two doubles  
     * Post: returns true if first is greater than the second, false otherwise
     */
    public static boolean larger(double x, double y) {
       if (x>y)
         return true;
       else
         return false;
    }

    /*
     * Pre: give a String
     * Post: return number of times character "a" is found in the string
     */
    public static int countA(String str) {
       int numA = 0;
       for (int i = 0; i<str.length(); i++)
       {
          if (str.charAt(i)=='a' || str.charAt(i)=='A')
             numA+=1;
       }
       return numA;
    }

    /*
     * Pre: give two integers
     * Post: returns true if first int is divisible by the second or vice versa
             returns false otherwise or if either paramter is 0
     */
    public static boolean evenlyDivisible(int x, int y) {
       if (x==0 || y==0)
          return false;
       else if (x%y==0 ||y%x==0)
          return true;
       else
          return false;
    }

    /*
     * Pre: give two integers
     * Post: returns average as floating point value
     */
    public static float average(int x, int y) {
       float avg = (float)(x+y)/2;
       return avg;
    }

    /*
     * Pre: give three integers
     * Post: returns average as floating point value
     */
    public static float average(int x, int y, int z) {
       float avg = (float)(x+y+z)/3;
       return avg;
    }

    /*
     * Pre: give four integers
     * Post: returns average as floating point value  
     */
    public static float average(int x, int y, int z, int a) {
       float avg = (float)(x+y+z+a)/4;
       return avg;
    }

    /*
     * Pre: give five integers
     * Post: returns average as floating point value  
     */
    public static float average(int x, int y, int z, int a, int b) {
       float avg = (float)(x+y+z+a+b)/5;
       return avg;
    }

    /*
     * Pre: give a string and an integer
     * Post: return string of string parameter concatenated with itself 
             (integer) times; returns original string if integer is <2
     */
    public static String multiConcat(String str, int x) {
       if (x<2)
          return str;
       String stri = "";
       for (int i = 0; i<x; i++)
          stri+=str;
       return stri;
    }

    /*
     * Pre: give a character
     * Post: returns true if it's an upper/lowercase alphabetical letter
     */
    // NOTE FROM TYLER - isAlpha was already completed when I downloaded the file
    // from D2L. Wasn't sure what to do, so I just let it go, but I thought you
    // should know.
    public static boolean isAlpha(char x) {
        System.out.print(x + " is uppercase or lowercase? ");
        if ((x >= 'a' && x <= 'z') || x >= 'A' && x <= 'Z') 
        {
            return (true);
        } 
        else 
        {
            return (false);
        }
    }

    /*
     * Pre: give a string
     * Post: get a string with all characters in reverse order
     */
    public static String reverse(String str) {
       String reversed = "";
       for (int i = str.length()-1; i>=0; i--)
          reversed += str.charAt(i);
       return reversed;
    }

    /*
     * Pre: give three integers that represent sides of a triangle
     * Post: return true if isosceles (but not equilateral), false otherwise   
     */
    public static boolean isIsoceles(int opp, int adj, int hyp) {
       if (opp==adj && opp!=hyp)
          return true;
       else if (opp==hyp && opp!=adj)
          return true;
       else if (adj==hyp && opp!=adj)
          return true;
       else
          return false;
    }

    /*
     * Pre: give two integers
     * Post: return a random number within their range, inclusive
     */
    public static int randomInRange(int x, int y) {
       if (x>y)
          return 0;
       Random rand = new Random();
       int num = x + rand.nextInt(y-x+1);
       return num;       
    }

    /*
     * Pre: 
     * Post: returns a string
     */
    public static void spacer() {
        System.out.println("\n----- Method #" + N + " -----\n");
        N++;
    }
}
