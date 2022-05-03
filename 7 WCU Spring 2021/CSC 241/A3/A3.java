/**
 * CSC 241 Assignment #3
 * 
 * On my honor, Tyler Prehl, this assignment is my own work.  
 * I, Tyler Prehl, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */
 
import java.io.File;
import java.util.Scanner;

/***  DO NOT MAKE ANY CHANGE TO CLASS A3  ***/
public class A3 {
	public static void main(String[] args) {								 
		try {
			File file = new File(args[0]);		
			Scanner sc = new Scanner(file);
			
			MyBankLinkedList list = new MyBankLinkedList();
			
			sc.nextLine();
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				Scanner s = new Scanner(line);
					
				Bank b = new Bank(s.next(), Integer.parseInt(s.next()), Double.parseDouble(s.next()),
					s.next(), Double.parseDouble(s.next()), Double.parseDouble(s.next()));
				list.add(b);
			}
			
			System.out.println("bankA year sizeofA bankB sizeofB diff");
			
			Node current = list.front;
			while(current != null) {				 
				System.out.println(current.data);
				current = current.next;
			}
			
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class MyBankLinkedList {
	/***  DO NOT MAKE ANY CHANGE TO FIELDS ***/
    Node front;

	/***  DO NOT MAKE ANY CHANGE TO CONSTRUCTORS  ***/
    public MyBankLinkedList() {
        front = null;
    }

    public void add(Bank value) {
		//---------------------------------------------------------------------
		// Fill in your code here
      
      /*
      Note to self - it would have been MUCH MUCH easier to just keep track of the 
      previous node AND the current node for insertion purposes (a lot easier to just
      check against the current and if it' fits in, pull from the last node for its
      to change its .next)
      */
      
      Node newBank = new Node(value);
      if (front==null) {
         front = newBank;
         //System.out.println("Front: "+front.data);
         return;
      }
      else if (front.next==null) {
         if (newBank.data.year>=front.data.year) {
            front.next = newBank;
            //System.out.println("Second: "+newBank.data);
            return;
         }
         else {
            Node temp = front;
            newBank.next = temp;
            front = newBank;
            //System.out.println("New Front: "+newBank.data);
            return;
         }
      }
      else {
         Node current = front;
         //System.out.println("NewBank: "+newBank.data);
         while (current!=null) {
            //System.out.println("Current: "+current.data);
            if (newBank.data.year==current.data.year) {
               if (current.next==null) {
                  current.next = newBank;
                  //System.out.println("Equal to this; next is null");
                  return;
               }
               else if (newBank.data.year<current.next.data.year) {
                  newBank.next = current.next;
                  current.next = newBank;
                  //System.out.println("Equal to this; less than next");
                  return;
               }
               current = current.next;
               //System.out.println("Equal to next; more to come");
               continue;
            }
            else if (newBank.data.year>current.data.year) {
               if (current.next==null) {
                  current.next = newBank;
                  //System.out.println("Greater than current, next is null");
                  return;
               }
               else if (newBank.data.year<current.next.data.year) {
                  newBank.next = current.next;
                  current.next = newBank;
                  //System.out.println("Greater than current, less than next");
                  return;
               }
               else {
                  current = current.next;
                  //System.out.println("Greater than current, next is not null");
               }

            }
            else if (newBank.data.year<current.next.data.year) {
               if (current == front) {
                  newBank.next = front;
                  front = newBank;
                  //System.out.println("Less than next, current is front");
                  return;
               }
               else {
                  newBank.next = current.next;
                  current.next = newBank;
                  //System.out.println("Less than next, not front");
                  return;
               }            
            }
         }
	   }
		//
		//---------------------------------------------------------------------		
    }
}

/***  DO NOT MAKE ANY CHANGE TO CLASS Bank  ***/
class Bank {
	public String bankA;
	public int year;
	public double sizeofA;
	public String bankB;
	public double sizeofB;
	public double diff;
	
	public Bank(String bankA, int year, double sizeofA, String bankB, double sizeofB, double diff) {
		this.bankA = bankA;
		this.year = year;
		this.sizeofA = sizeofA;
		this.bankB = bankB;
		this.sizeofB = sizeofB;
		this.diff = diff;
	}
	
	public String toString() {
		return this.bankA + " " + this.year + " " + this.sizeofA + " " + 
				this.bankB + " " + this.sizeofB + " " + this.diff;
	}
}

/***  DO NOT MAKE ANY CHANGE TO CLASS Node  ***/
class Node {
	Bank data;
	Node next;

	public Node(Bank data) {
		this.data = data;
		this.next = null;
	}

	public Node(Bank data, Node next) {
		this.data = data;
		this.next = next;
	}
}

