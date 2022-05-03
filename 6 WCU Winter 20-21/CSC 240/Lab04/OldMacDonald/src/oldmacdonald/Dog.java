package oldmacdonald;
/*
Tyler Prehl
CSC 240-01
1/9/21
Lab04 - Inheritance and Polymorphism
Create multiple classes revolving around the song 'Old MacDonald Had a Farm'
to demondstrate uses of inheritance of polymorphism.
*/

public class Dog implements Animal
{
   private String myType;
   private String mySound;
   
   public Dog()
   {
      myType = "dog";
      mySound = "woof";
   }
   
   public String getSound()
   {
      return mySound;
   }
   
   public String getType()
   {
      return myType;
   }
}