/**
 * CSC 241 Assignment #4
 * 
 * On my honor, Tyler Prehl, this assignment is my own work.  
 * I, Tyler Prehl, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

/***  DO NOT ADD MORE IMPORT DECLARATIONS  ***/ 
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;

public class A4 {
	/***  DO NOT MAKE ANY CHANGES TO main  ***/
	public static void main(String[] args) throws FileNotFoundException {		
		Scanner input = new Scanner(new File("input.txt"));
		PrintStream out = new PrintStream(new File("output.txt"));
		while (input.hasNextLine()) {
			String line = input.nextLine();
			out.println(evalExp(line));
		}
		out.close();
	}
	
	/***  DO NOT ADD MORE FIELD DECLARATIONS  ***/ 
	private static final MyGenericStack<Double> valStk = new MyGenericStack<Double>(); 
	private static final MyGenericStack<String> opStk = new MyGenericStack<String>();
	
	/***  DO NOT CHANGE THE METHOD SIGNATURE (name and parameters) ***/ 
	public static double evalExp(String exp) {
		//---------------------------------------------------------------------
		// Fill in your code here
      String [] tokens = exp.split(" ");
     
      for (int i = 0; i<tokens.length; i++) {
         if (tokens[i].equals("*") || tokens[i].equals("/") || tokens[i].equals("+") ||
             tokens[i].equals("-")) {
            repeatOps(tokens[i]);
            opStk.push(tokens[i]);
         }
         else
            valStk.push(Double.parseDouble(tokens[i]));
      }
      repeatOps("$");
      return valStk.pop();
      
		//
		//---------------------------------------------------------------------
	}
	
	/***  DO NOT CHANGE THE METHOD SIGNATURE (name and parameters) ***/ 
	private static void doOp() {
		//---------------------------------------------------------------------
		// Fill in your code here
      double x = valStk.pop();
      double y = valStk.pop();
      String op = opStk.pop();
      double z = 0;
      switch(op) {
         case "*":
            z = y*x;
            break;
         case "/":
            z = y/x;
            break;
         case "+":
            z = y+x;
            break;
         case "-":
            z = y-x;
            break;
      }
      valStk.push(z);
	   
		//
		//---------------------------------------------------------------------
	}
		
	/***  DO NOT CHANGE THE METHOD SIGNATURE (name and parameters) ***/ 
	private static void repeatOps(String refOp) {
		//---------------------------------------------------------------------
		// Fill in your code here
      while (valStk.size()>1 && prec(refOp)<=prec(opStk.peek()))
         doOp();
	   
		//
		//---------------------------------------------------------------------
	}
	
	/***  DO NOT CHANGE THE METHOD SIGNATURE (name and parameters) ***/ 
	private static int prec(String refOp) {
		//---------------------------------------------------------------------
		// Fill in your code here */ -> +- -> $
      switch(refOp) {
         case "*":
            return 2;
         case "/":
            return 2;
         case "+":
            return 1;
         case "-":
            return 1;
         case "$":
            return 0;
      }
      return 0;
	   
		//
		//---------------------------------------------------------------------
	}
}

/***  DO NOT MAKE ANY CHANGES TO class MyGenericStack  ***/
class MyGenericStack<T> {
	private Node<T> front;
	private int size;

	public MyGenericStack() {
		front = null;
		size = 0;
	}

	public void push(T data) {
		front = new Node<T>(data, front);
		size++;
	} 
	
	public T peek() {
		if(front == null) return null;
		return front.data;
	}

	public T pop() {
		if(front == null) return null;
		size--;
		Node<T> temp = front;
		front = front.next;
		return (T)temp.data;
	}
	
	public int size() {
		return size;
	}
}

/***  DO NOT MAKE ANY CHANGES TO class Node  ***/
class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}
}