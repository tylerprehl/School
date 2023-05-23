/**
 * CSC 345 Assignment #2
 * 
 * On my honor, Tyler Prehl, this assignment is my own work.  
 * I, Tyler Prehl, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */
 
import java.io.*;

// Students -- Add your import declarations here
import java.util.*;

public class A2 {
	
	// Students -- Add your constants here
   static int charClass;
   static String lexeme;
   static char nextChar;
   static int lexLen;
   static int token;
   static int nextToken;
   static Scanner sc;
   static String program;
   static int programIndex = 0;
   
   // character classes
   static final int LETTER = 0;
   static final int DIGIT = 1;
   static final int UNKNOWN = 99;
   // token codes
   static final int INT_LIT = 10;
   static final int IDENT = 11;
   static final int ASSIGN_OP = 20;
   static final int ADD_OP = 21;
   static final int SUB_OP = 22;
   static final int MULT_OP = 23;
   static final int DIV_OP = 24;
   static final int LEFT_PAREN = 25;
   static final int RIGHT_PAREN = 26;
   
	
	public static void main(String[] args) { 
      try {
			// do not make any changes to the following TWO lines
			File file = new File(args[0]);	
			Scanner sc = new Scanner(file);		// do not make any other Scanners
			
			// Students -- your code and methods calls go here
         while(sc.hasNextLine()) {
				program = program + sc.nextLine();
			}
         program = program.substring(4);
            
         getChar();
         //System.out.println(nextChar + "    " + charClass);
         do {
            lex();
         }
         while (nextToken != -1);
         
        	sc.close();
		} catch (Exception e) {
			System.out.println("ERROR - cannot open front.in \n");
		}
	}
	
	// Students -- add your method declarations here
   
   // LEX
   // lexical analyzer for simple arithmetic expressions
   static int lex() {
      lexLen = 0;
      lexeme = "";
      getNonBlank();
      
      switch (charClass) {
         case LETTER:
            addChar();
            getChar();
            while (charClass == LETTER || charClass == DIGIT) {
               addChar();
               getChar();
            }
            nextToken = IDENT;
            break;
         case DIGIT:
            addChar();
            getChar();
            while (charClass == DIGIT) {
               addChar();
               getChar();
            }
            nextToken = INT_LIT;
            break;
         case UNKNOWN:
            lookup(nextChar);
            getChar();
            break;
         case -1:
            nextToken = -1;
            lexeme = "EOF";
            break;
      }
      System.out.println("Next token is: " + nextToken + 
                         ", Next lexeme is " + lexeme);
      return nextToken;
   }
   
   // GET CHAR
   // gets next character of input AND determines it's character class
   static void getChar() {
      try {
         nextChar = program.charAt(programIndex);
         
         if (programIndex<program.length()) {
            programIndex++;
            //System.out.println("  getChar(): " + nextChar);
            if (Character.isLetter(nextChar))
               charClass = LETTER;
            else if (Character.isDigit(nextChar))
               charClass = DIGIT;
            else 
               charClass = UNKNOWN;
         }
         return;
      }
      catch (Exception Exception) {
         charClass = -1;
         return;
      }         
   }
   
   // ADD CHAR
   // adds next character to lexeme String
   static void addChar() {
      if (lexLen < 99) {
         lexeme = lexeme + nextChar;
         lexLen++;
         //System.out.println("   addChar() lexeme: " + lexeme);
      }
      else
         System.out.println("Error - lexeme is too long ");
   }
   
   // GET NON BLANK
   // gets next non-blank character by continuous getChar() call
   static void getNonBlank() {
      while (Character.isWhitespace(nextChar)) {
         if (charClass == -1)
            return;
         //System.out.println("   REMOVED SPACE   ");
         getChar();
      }
   }
   
   // LOOKUP
   // looks up operators and parentheses and returns its token
   static int lookup(char ch) {
      //System.out.println("   lookup(): " + ch);
      switch (ch) {
         case '(':
            addChar();
            nextToken = LEFT_PAREN;
            break;
         case ')':
            addChar();
            nextToken = RIGHT_PAREN;
            break;
         case '+':
            addChar();
            nextToken = ADD_OP;
            break; 
         case '-':
            addChar();
            nextToken = SUB_OP;
            break;
         case '*':
            addChar();
            nextToken = MULT_OP;
            break;
         case '/':
            addChar();
            nextToken = DIV_OP;
            break;
         default:
            addChar();
            nextToken = -1;
            break;
      }
      return nextToken;
   }
}
