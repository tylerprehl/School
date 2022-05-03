package oldmacdonald;
/*
Tyler Prehl
CSC 240-01
1/9/21
Lab04 - Inheritance and Polymorphism
Create multiple classes revolving around the song 'Old MacDonald Had a Farm'
to demondstrate uses of inheritance of polymorphism.
*/

public class Farm
{
   private Animal [] myFarm;
   
   public Farm()
   {
      myFarm = new Animal [4];
      myFarm[0] = new Cow();
      myFarm[1] = new Chick();
      myFarm[2] = new Dog();
      myFarm[3] = new NamedCow("Betsy");
   }
   
   public void animalSounds()
   {
      Animal temp;
      for (int i = 0; i< myFarm.length; i++)
      {
         temp = myFarm[i];
         System.out.println(temp.getType()+" goes "+temp.getSound());
      }
      
      Chick tweety = new Chick(true);
      for (int i = 0; i < 5; i++)
         System.out.println(tweety.getSound());
      
      NamedCow named = (NamedCow)myFarm[3];
      System.out.println(named.getName());
   }
}