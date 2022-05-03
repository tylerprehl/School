package oldmacdonald;
/*
Tyler Prehl
CSC 240-01
1/9/21
Lab04 - Inheritance and Polymorphism
Create multiple classes revolving around the song 'Old MacDonald Had a Farm'
to demondstrate uses of inheritance of polymorphism.
*/

public class NamedCow extends Cow
{
   private String name;
   
   public NamedCow(String name)
   {
      super();
      this.name = name;
      
   }
   
   public String getName()
   {
      return name;
   }
}