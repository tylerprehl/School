package oldmacdonald;
/*
Tyler Prehl
CSC 240-01
1/9/21
Lab04 - Inheritance and Polymorphism
Create multiple classes revolving around the song 'Old MacDonald Had a Farm'
to demondstrate uses of inheritance of polymorphism.
*/

import java.util.Random;

public class Chick implements Animal
{
   private String myType;
   private String mySound;
   private boolean twoSounds;
   
   public Chick()
   {
      myType = "chick";
      mySound = "cheep";
   }
   public Chick(boolean twoSounds)
   {
      myType = "chick";
      this.twoSounds = twoSounds;
      mySound = getSound();
   }
   
   public String getSound()
   {
      if (twoSounds)
      {
         Random rand = new Random();
         int N = rand.nextInt(2);
         if (N==0)
            return "cheep";
         else
            return "chirp";
      }
      else
         return "cheep";
   }
   
   public String getType()
   {
      return myType;
   }
}