/**
 * CSC 241 Assignment #2
 * 
 * On my honor, Tyler Prehl, this assignment is my own work.  
 * I, Tyler Prehl, will follow the instructor's rules and processes 
 * related to academic integrity as directed in the course syllabus.
 *
 */

public class A2 {	
	public static void main(String[] args) {
		// The following is example code for testing.
		// Feel free to make changes to the main method. 
		StudentRecord[] arr1 = { new StudentRecord("Kathryn",   4.0,  36104), 
								 new StudentRecord("Christine", 3.97, 49801),
								 new StudentRecord("Timothy",   3.89, 96813),
								 new StudentRecord("Brijian",   3.71, 62701),
								 new StudentRecord("Jose",      3.64, 55102) };
								
		StudentRecord[] arr2 = { new StudentRecord("Ivianni",   3.55, 13301), 
								 new StudentRecord("Julian",    3.42, 28608),
								 new StudentRecord("Francisco", 3.39, 87501),
								 new StudentRecord("Antoni",    3.2,  73102),
								 new StudentRecord("Peter",     3.13, 10000) };

		MyGenericArrayList<StudentRecord> list1 = new MyGenericArrayList<StudentRecord>();

		MyGenericArrayList<StudentRecord> list2 = new MyGenericArrayList<StudentRecord>();
		for(StudentRecord e : arr2) list2.add(e);
		
		list1.add(arr1[0]);			A2.print(list1);
		list1.add(arr1[3]);			A2.print(list1);
		list1.add(1, arr1[4]);		A2.print(list1);		
		list1.add(4, arr1[2]);		A2.print(list1);	//invalid index
		int i = list1.indexOf(arr1[3]);
		list1.addAll(i, list2);		A2.print(list1);
		list1.addAll(9, list2);		A2.print(list1);	//invalid index
		list1.remove(-4);			A2.print(list1);	//invalid index
		list1.remove(6);			A2.print(list1);
		list1.set(1, arr1[1]);		A2.print(list1);
		list1.set(7, arr1[4]);		A2.print(list1);	//invalid index
		System.out.println(list1.contains(arr1[1]));
		System.out.println(list1.contains(arr1[4]));
		list1.clear();				A2.print(list1);
	}
	
	public static void print(MyGenericArrayList<StudentRecord> list) {
		int size = list.size();
		System.out.println("Student Records (size=" + list.size() + ")");
		for(int i = 0; i < size; i++) {
			StudentRecord e = list.get(i);
			System.out.println("    [" + i + "] " + e.name + ", " + e.gpa + ", " + e.zipcode);
		}
	}
}

class MyGenericArrayList<T> {
	private Object[] arr = new Object[0];
	
	// Append the given element at the end of the list
	public void add(T element) {		
		//---------------------------------------------------------------------
		// Fill in your code here
      Object[] temp = new Object[arr.length+1];
      for (int i = 0; i<arr.length; i++)
         temp[i] = arr[i];
      temp[temp.length-1] = element;
      arr = temp;
		//
		//---------------------------------------------------------------------
	}

	// Insert the given element at the given index
	// Do nothing if the given index is not valid
	public void add(int index, T element) {		
		//---------------------------------------------------------------------
		// Fill in your code here
		if (index>=0 && index<arr.length)
      {
         Object[] temp = new Object[arr.length+1];
         for (int i = 0; i<index; i++)
            temp[i] = arr[i];
         temp[index] = element;
         for (int i = index; i<arr.length; i++)
            temp[i+1] = arr[i];
         arr = temp;
		}
      //
		//---------------------------------------------------------------------
	}

	// Insert all elements from the given list into this list, starting at the given index
	// Do nothing if the given index is not valid
	public void addAll(int index, MyGenericArrayList<T> list) {		
		//---------------------------------------------------------------------
		// Fill in your code here
      if (index>=0 && index<arr.length)
      {
         Object[] temp = new Object[arr.length+list.size()];
         for (int i = 0; i<index; i++)
            temp[i] = arr[i];
         int j = 0;
         for (int i = index; i<index+list.size(); i++)
         {
            temp[i] = list.get(j);
            j++;
         }
         for (int i = index; i<arr.length; i++)
            temp[i+list.size()] = arr[i];
         arr = temp;
		}
		//
		//---------------------------------------------------------------------
	}

	// Remove all elements from the list
	public void clear() {		
		//---------------------------------------------------------------------
		// Fill in your code here
      Object[] temp = new Object[0];
      arr = temp;
		//
		//---------------------------------------------------------------------
	}
	
	// Return true if the list contains the given element
	// Return false if not found
	public boolean contains(T element) {
		boolean retVal = false;
		//---------------------------------------------------------------------
		// Fill in your code here
      for (int i = 0; i<arr.length; i++)
      {
         if (arr[i].equals(element))
            return true;
      }
		//
		//---------------------------------------------------------------------/
		return retVal;
	}
	
	// Return the element at given index
	// Do nothing if the given index is not valid
	public T get(int index) {
		T retVal = null;
		//---------------------------------------------------------------------
		// Fill in your code here
      if (index>=0 && index<arr.length)
         return (T)arr[index];
		//
		//---------------------------------------------------------------------
		return retVal;
	}

	// Return the first index where the given element is found in the list
	// Return -1 if not found
	public int indexOf(T element) {
		int retVal = -1;
		//---------------------------------------------------------------------
		// Fill in your code here
      
      for (int i = 0; i<arr.length; i++)
      {
         if (arr[i].equals(element))
            return i;
      }
      
		//
		//---------------------------------------------------------------------
		return retVal;
	}
	
	// remove the element at the given index
	// Do nothing if the given index is not valid
	public void remove(int index) {
		//---------------------------------------------------------------------
		// Fill in your code here
      if (index>=0 && index<arr.length)
      {
         Object[] temp = new Object[arr.length-1];
         for (int i = 0; i<index; i++)
            temp[i] = arr[i];
         for (int i = index; i<temp.length; i++)
            temp[i] = arr[i+1];
         arr = temp;
      }
      return;
		//
		//---------------------------------------------------------------------
	}

	// Replace the element at the given index with the given element
	// Do nothing if the given index is not valid
	public void set(int index, T element) {
		//---------------------------------------------------------------------
		// Fill in your code here
      if (index>=0 && index<arr.length)
         arr[index] = element;
      return;
		//
		//---------------------------------------------------------------------
	}

	// Return the number of elements in the list
	public int size() {
		int retVal = -1;
		//---------------------------------------------------------------------
		// Fill in your code here
      if (arr.length>=0)
         return arr.length;
		//
		//---------------------------------------------------------------------
		return retVal;
	}
}

class StudentRecord {
	String name;	
	double gpa;
	int zipcode;
	
	public StudentRecord(String name, double gpa, int zipcode) {
		this.name = name;
		this.gpa = gpa;
		this.zipcode = zipcode;
	}
}