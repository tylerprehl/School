public class Person
{
   private String name;
   private int age;
   
   public Person(String personName, int personAge)
   {
      name = personName;
      age = personAge;
   }
   
   public boolean has_same_name(Person x)
   {
      if (name.equals(x.getName()))
         return true;
      else
         return false;
   }
   
   public boolean has_same_age(Person x)
   {
      if (age == x.getAge())
         return true;
      else
         return false;
   }
   
   public boolean is_younger_than(Person x)
   {
      if (age<x.getAge())
         return true;
      else
         return false;
   }
   
   public boolean is_older_than(Person x)
   {
      if(age>x.getAge())
         return true;
      else
         return false;
   }//a.is_older_than(b)
   
   public String getName()
   {
      return name;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String toString()
   {
      return "N("+name+"), A("+age+")";
   }
}