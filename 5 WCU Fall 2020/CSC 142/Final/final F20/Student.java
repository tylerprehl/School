public class Student implements Comparable
{
   private String name;
   private int grade[];
   // no more any other attribute.
   
   public Student (String n, int [] g)
   {
      name = n;
      grade = new int [g.length];
      for(int i = 0; i< g.length; i++)
         grade[i] = g[i];
   }
   
   // Your development will go here.
   public double get_average()
   {
      double sum = 0;
      for (int i=0; i<grade.length; i++)
         sum += grade[i];
      double avg = sum/grade.length;
      return avg;
   }
   
   public String get_name()
   {
      return name;
   }
   
   public String toString()
   {
      double total = get_average();
      if (total>=90) return "A";          
      else if (total>=80) return "B";     
      else if (total>=65) return "C";    
      else if (total>=60) return "D";     
      else return "F";                      
   }
   
   public int compareTo(Object o) // Not complete
	{
		if ((o != null) &&
		    (o instanceof Student))
		{
   	   Student otherStudent = (Student) o;
         if (get_average()>otherStudent.get_average())
            return 1;
         else if (get_average()==otherStudent.get_average())
            return 0;
         else
            return -1;         
		}
	   return -1;
	}
} // end of class Student