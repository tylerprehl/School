package lab05;
/*
Tyler Prehl
CSC 240-01
1/11/21
Lab 05 - Interfaces and Abstract Classes
Experiment with interfaces and abstract classes by talking about various animals
*/
import java.util.Scanner;

public class TestAnimals
{
   public static void main(String[] args)
   {
      Fish d = new Fish();
      Cat c = new Cat("Fluffy");
      Animal a = new Fish();
      Animal e = new Spider();
      Pet p = new Cat();
      
      //Fish d test
      d.eat();
      d.walk();
      System.out.println("This animal's name is " + d.getName());
      d.setName("Float");
      System.out.println("This animal's name is " + d.getName());
      d.play();
      System.out.println();
      
      //Cat c test
      c.eat();
      c.walk();
      System.out.println("This animal's name is " + c.getName());
      c.setName("Carter");
      System.out.println("This animal's name is " + c.getName());
      c.play();
      System.out.println();
      
      //Animal(Fish) a test
      a.eat();
      a.walk();
      // because Fish 'a' is referenced by Animal class, it cannot utilize Pet interface
      Fish fishy = (Fish)a;
      System.out.println("This animal's name is " + fishy.getName());
      fishy.setName("Float");
      System.out.println("This animal's name is " + fishy.getName());
      fishy.play();
      System.out.println();
      
      //Animal(Spider) e test
      e.eat();
      e.walk();
      System.out.println();
      
      //Pet(Cat) p test
      System.out.println("This animal's name is " + p.getName());
      p.setName("Fish Sticks");
      System.out.println("This animal's name is " + p.getName());
      p.play();
      // because Cat 'p' is referenced by Pet interface, it cannot utilize Animal class
      Cat cat = (Cat)p;
      cat.eat();
      cat.walk();
      System.out.println();
   }
}

abstract class Animal
{
   protected int legs;
   
   protected Animal(int legs)
   {
      this.legs = legs;
   }
   
   public abstract void eat();
   
   public void walk()
   {
      System.out.println("This animal walks with the help of its " +legs+" legs.");
   }
}

interface Pet
{
   public String getName();
   
   public void setName(String name);
   
   public void play();
}

class Spider extends Animal
{
   public Spider()
   {
      super(8);
   }
   
   public void eat()
   {
      System.out.println("Spiders commonly consume the blood of insects including flies "+
                         "and mosquitos.");
   }
}

class Cat extends Animal implements Pet
{
   private String name;
   
   public Cat(String name)
   {
      super(4);
      this.name = name;
   }
   public Cat()
   {
      this("");
   }
   
   public String getName()
   {
      if (name == "")
         return "Unknown :(";
      else
         return name;
   }
   
   public void setName(String name)
   {
      System.out.println("Oh? \""+name+"\" is this cat's name? OK!");
      this.name = name;
   }
   
   public void play()
   {
      System.out.println(name+", come play outside with me!");
   }
   
   public void eat()
   {
      System.out.println(name+", like most cats, eats rats it finds outside.");
   }
}

class Fish extends Animal implements Pet
{
   private String name;

   public Fish()
   {
      super(0);
      name = "Unknown :(";
   }
   
   public String getName()
   {
      if (name == "")
         return "Unknown :(";
      else
         return name;
   }
   
   public void setName(String name)
   {
      System.out.println("Oh? \""+name+"\" is this fishy's name? OK!");
      this.name = name;
   }
   
   public void play()
   {
      // This is a Finding Nemo reference in case you were wondering
      System.out.println(name+", let's play \"who can get closer to the butt\"!");
   }
   
   public void eat()
   {
      System.out.println(name+", like most fish, eats other fish! (Just kidding, "+
                         name+" is a vegetarian and only eats algae and zooplankton.");
   }
   
   public void walk()
   {
      System.out.println("It's unfortunate that fish have "+legs+" legs and can't go "+
                         "for a walk with me.");
   }
}
