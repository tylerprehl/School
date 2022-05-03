/**
 * CSC 241 Assignment #6
MY COPY DO NOT SUBMIT
DO NOT SUBMIT
 */

/***  DO NOT ADD ANY IMPORT DECLARATION  ***/
import java.io.File;
import java.util.Scanner;

/***  DO NOT MAKE ANY CHANGE TO CLASS A6  ***/
public class A6_MYCOPY_DONOTSUBMIT {
	public static void main(String[] args) {								 
		MyGenericLinkedHashMap<Bank> hashmap = 
					new MyGenericLinkedHashMap<Bank>(Integer.parseInt(args[1]));

		try {
			File file = new File(args[0]);
			Scanner sc = new Scanner(file);
			sc.nextLine();
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				Scanner s = new Scanner(line);
					
				Bank b = new Bank(s.next(), Integer.parseInt(s.next()), Double.parseDouble(s.next()),
					s.next(), Double.parseDouble(s.next()), Double.parseDouble(s.next()));
				
				hashmap.add(b);
			}
			sc.close();

			//-------------------------------------------------
			//
			//  FILL IN HERE
         int min = 2147483647;
         int max = 0;
         int arrSize = Integer.parseInt(args[1]);
         for (int i = 0; i<arrSize; i++) {
            if (hashmap.arr[i]!=null) {
               if (hashmap.getListSize(i)>max)
                  max = hashmap.getListSize(i);
               if (hashmap.getListSize(i)<min)
                  min = hashmap.getListSize(i);
            }
            else
               min = 0;
         }
         
			//
			//-------------------------------------------------
			
			System.out.println("expected=" + 15424.0/Integer.parseInt(args[1]) + ", min=" + min + ", max=" + max);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

class MyGenericLinkedHashMap<T> {
	public Object[] arr;
	
	public MyGenericLinkedHashMap(int capacity) {
		arr = new Object[capacity];
	}

	public void add(T target) {
		//-------------------------------------------------
		//
		//  FILL IN HERE

      int index = hashCode(target.hashCode());
      
      if (arr[index]==null)
         arr[index] = new MyGenericLinkedList<T>();
      MyGenericLinkedList atIndex = (MyGenericLinkedList)arr[index];
      atIndex.add(target); 
      
      
		//
		//-------------------------------------------------
	}
	
	public int getListSize(int index) {
		//-------------------------------------------------
		//
		//  FILL IN HERE
      
      if (arr[index]==null)
         return 0;
      MyGenericLinkedList atIndex = (MyGenericLinkedList)arr[index];
      return atIndex.size();
      
		//
		//-------------------------------------------------
	}
	
	public int hashCode(int hashcode) {
		return Math.abs(hashcode) % arr.length;
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
	
	public int hashCode() {
		return Double.hashCode(this.diff);
	}
}

/***  DO NOT MAKE ANY CHANGE TO CLASS MyGenericLinkedList  ***/
class MyGenericLinkedList<S> {
    Node<S> front;
	int size;

    public MyGenericLinkedList() {
        front = null;
		size = 0;
    }

    public void add(S value) {
        if (front == null) {
            front = new Node<S>(value);
			size++;
        } else {
            Node<S> current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<S>(value);
			size++;
        }
    }
	
	public S get(int index) {
		if((index < 0) || (index >= size()))	return null;
		
		Node<S> current = front;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return (S)current.data;
	}
    
	public int indexOf(S data) {
		int index = 0;
		Node<S> current = front;
		while (current != null) {
			if(current.data == data)	return index;
			current = current.next;
			index++;
		}
		
		return -1;
	}

	public void remove(int index) {
		if((index < 0) || (index >= size()))	return;
		
		if (index == 0) {
			front = front.next;
			size--;
		} else {
			Node<S> current = front;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
			size--;
		}
	}
	
	public int size() {
		return size;
	}
}

/***  DO NOT MAKE ANY CHANGE TO CLASS Node  ***/
class Node<X> {
	X data;
	Node<X> next;

	public Node(X data) {
		this.data = data;
		this.next = null;
	}

	public Node(X data, Node<X> next) {
		this.data = data;
		this.next = next;
	}
}

