/**
 * CSC 402-02 Assignment #1
 * 
 * On my honor, Tyler Prehl, this assignment is my own work.  
 * I, Tyler Prehl, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class A1 {
    
    // DO NOT ALTER THE FOLLOWING LINE except for the value of the literal int.
    // You may change the literal int assigned to SIZE to any value from 2 to 100.
    // In the final version of the program you submit set the SIZE to 3.
    public static final int SIZE = 3;

    public static void main(String[] args) {
		//---------------------------------------------------------------------
		// Fill in your code here
      printTop();
      printBottom();		
		
		//
		//---------------------------------------------------------------------
    }

	//---------------------------------------------------------------------
	// Fill in your code here

	// You will need to create (nested) for-loops with print and println statements 
	// that use the class constant and local variables.  

	// You are not allowed to use anything besides println/print statements, 
	// static methods, method calls, loops, nested loops, and class constants.
	
	// You are ***NOT*** allowed to use method parameters, methods that return values, or 
	// conditional statements (i.e., if, if/else statements).
   
   public static void printTop() { // prints top structure
      printHashtags();
      printPipes();
      printHashtags();
   }
   
   public static void printHashtags() { // prints line of hashtags
      printSpaces();
      printExtraSpaces();      
      for (int hashtags = 1; hashtags <= SIZE*2-1; hashtags++) 
         System.out.print("#");
      System.out.println();
   }
      
   public static void printPipes() { // prints all lines of pipes
      for (int pipesLength = 1; pipesLength <= (SIZE-1)*2; pipesLength++) { // prints right # of pipe lines
         printSpaces();
         printExtraSpaces();
         for (int pipesWidth = 1; pipesWidth <= SIZE*2-1; pipesWidth++) // prints pipes in the line
            System.out.print("|");
         System.out.println();
      }
   }
   
   public static void printExtraSpaces() {
      System.out.print("  "); // there are two spaces here
   }
   
   public static void printBottom() { // prints bottom structure
      for (int bot = 1; bot <= SIZE*SIZE; bot++) {
         printSpaces();
         printTildes();
         printSpaces();
         printOs();
      }
      printSpaces();
      printTildes();
   }
   
   public static void printTildes() { // prints line of tildes
      for (int tildes = 1; tildes <= SIZE*2 + 3; tildes++)
         System.out.print("~");
      System.out.println();
   }
   
   public static void printOs() { // prints line of alternating -'s and O's 
      System.out.print("|");
      for (int dashOs = 1; dashOs <= SIZE; dashOs++)
         System.out.print("-O");
      System.out.print("-");      
      System.out.print("|");
      System.out.println();
   }
   
   public static void printSpaces() { // prints initial spaces for every line
      for (int i = 0; i < SIZE*4; i++)
         System.out.print(" ");
   }
	
	//
	//---------------------------------------------------------------------
}
